package vd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Action;
import javax.swing.JPanel;

public class Run extends JPanel implements Runnable {
	
	public static int size = 48;
	public int maxCol = 16,maxRow = 12;
	public int width = maxCol * size;
	public int height = maxRow * size;
	public Thread thread0;
    public int playgame;
	public final int pause = 0 , play =1;
	
	
	public static Emty emty ;
	public Key key =  new Key(this);
	public Player player = new Player(this, key);
	public Tilemanage1 tilema= new Tilemanage1(this);
	public CheckCham checkCham =  new CheckCham(this);
	public SuperObject obj[] = new SuperObject[30];
	public Asset asset = new Asset(this);
	public Music music = new Music();
	public Music mu = new Music();
	public hasKey countkey = new hasKey(this);
			
	
	
	public final int maxworldCol = 50;
	public final int maxworldRow = 50;
	
	 
	
	
	public Run() {
		this.setPreferredSize(new Dimension(width, height));
    	this.setDoubleBuffered(true);
    	this.setBackground(Color.white);
    	this.addKeyListener(key);
    	this.setFocusable(true);
    	
    	
    	
	}
	
	
	public void startGame() {
		  thread0 = new Thread(this);
		thread0.start();
	}
	public void setupGame () {
		asset.setObj();
		playMusic(0);
		playgame = play;
	}
	
	
	public void playMusic(int i ) {
		music.setFile(i);
		music.play();
		music.loop();
	}
	
	public void playSE(int i) {
		mu.setFile(i);
		mu.play();
	}
	
	public void stopMusic() {
		music.stop();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(thread0 != null) {
			update();
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		  g2.setColor(Color.white);
	        g2.fillRect(0, 0, WIDTH, HEIGHT);
		
	    
	    tilema.draw(g2);
	    
	    for(int i=0; i<obj.length; i++) {
	    	if(obj[i] != null) {
	    		obj[i].draw(g2, this);
	    	}
	    }
	    
	    countkey.draw(g2);
//	    key.draw(g2);
	    
		player.draw(g2);
		
		g2.dispose();
		
	}
	
	public void update() {
		if(playgame == play) {
			player.update();
		}else if(play == pause) {
			// nothing
		}
			
	}

	 

}
