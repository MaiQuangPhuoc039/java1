package Main;
 

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Run extends   JPanel implements Runnable , ActionListener {
    
     
    // size baby
	public  static  int size = 48;
	
	
	// maxcol va maxrow camera
	public static   int maxcol = 16, maxrow = 12;
	public    int width = size * maxcol;
	public   int height = size * maxrow;
	 
    
	// su dung dox xml
    public int gameState;
    public final int playState = 1  , pauseState= 0 ;
//    private static int time;
    Thread thread0 ;

	
	
	
	public static String huong   ;  // hướng up dow 
	public String gioithieu;
	public String quyluat;
	public String nhanvat;
	
	
	public Key key  = new Key(this);
	public  Tilemanager tilemanager = new Tilemanager(this);
	public Tile tile =  new Tile();
	public static  Emty emty ;


	public static JFrame frame;
//	public MatKhau login = null;
	public hasKey countKey  = new hasKey(this);
	public  CheckCham  checkCham = new CheckCham(this);
	public AssetSetter asset = new AssetSetter(this);
	public Player player = new Player(this, key);
	public Music music  = new Music();
	public Music se  = new Music();
	public SuperObject obj [] = new SuperObject[40];
	 
	
	
 
	// thông tin về map to 
	// max cot = 50 (map)
	public  final   int maxWorldCol = 50;     
	public final   int  maxWorldRow = 50;
	public int x = player.screenX;
	public String screenX = String.valueOf(x);
	public int y = player.screenY;
	public String screenY = String.valueOf(y);
	public int maxcol1 = maxcol;
	public String maxcol11 = String.valueOf(maxcol1);
	public int maxrow1 = maxrow;
	public String maxrow11 = String.valueOf(maxrow1);
	public int width1 = width;
	public String width11 = String.valueOf(width1);
	public int height1 = height;
	public String height11 = String.valueOf(height1);
	public int maxMapCol = maxWorldCol;
	public String maxMapCol1 = String.valueOf(maxMapCol);
	public int maxMapRow = maxWorldRow;
	public String maxMapRow1 = String.valueOf(maxMapRow);


	private JButton button;
	
	 
   


	public Run() {
    	
    	
    	this.setPreferredSize(new Dimension(width, height));
    	this.setDoubleBuffered(true);
    	this.setBackground(Color.black);
    	this.addKeyListener(key);
    	this.setFocusable(true);
    	
    	
    	
//    	
    }
    

	@Override
	public String toString() {
		
		return   " --------------------------------------------\n Player\n ---------------------------------------"
				+ "\n GIỚI THIỆU : " + gioithieu 
				+ "\n\n QUY LUẬT : " + quyluat
				+ "\n\n NHÂN VẬT : " + nhanvat
				+"\n\n HƯỚNG :"+huong 
				+ "\n\n maxMapCol : " + maxMapCol1+ " , maxMapRow=" + maxMapRow1
				+ "\n\n SCREENX=" + screenX+ "    , SCREENY=" + screenY
				+  "\n\n WIDTH = "+width11 +"    , HEIGHT = "+height11
				+"\n\n MAXCOL : "+maxcol11 +"    , MAXROW :"+maxrow11
				+"\n\n"
				;
	}

    


	public String getScreenX() {
		return screenX;
	}
	public String getMaxMapCol1() {
		return maxMapCol1;
	}

	public void setMaxMapCol1(String maxMapCol1) {
		this.maxMapCol1 = maxMapCol1;
	}
	public String getMaxMapRow1() {
		return maxMapRow1;
	}
	public void setMaxMapRow1(String maxMapRow1) {
		this.maxMapRow1 = maxMapRow1;
	}
	public String getWidth11() {
		return width11;
	}
	public void setWidth11(String width11) {
		this.width11 = width11;
	}
	public String getHeight11() {
		return height11;
	}
	public void setHeight11(String height11) {
		this.height11 = height11;
	}
	public String getMaxcol11() {
		return maxcol11;
	}
	public void setMaxcol11(String maxcol11) {
		this.maxcol11 = maxcol11;
	}
	public String getMaxrow11() {
		return maxrow11;
	}
	public void setMaxrow11(String maxrow11) {
		this.maxrow11 = maxrow11;
	}
	public void setScreenX(String screenX) {
		this.screenX = screenX;
	}
	public String getScreenY() {
		return screenY;
	}
	public void setScreenY(String screenY) {
		this.screenY = screenY;
	}
 
	public static int getMaxcol() {
		return maxcol;
	}
 
	public static void setMaxcol(int maxcol) {
		Run.maxcol = maxcol;
	}
 
	public static int getMaxrow() {
		return maxrow;
	}
 
	public static void setMaxrow(int maxrow) {
		Run.maxrow = maxrow;
	}
 
	public int getHeight() {
		return height;
	}
 
	public void setHeight(int height) {
		this.height = height;
	}
 
	public static String getHuong() {
		return huong;
	} public static void setHuong(String huong) {
		Run.huong = huong;
	} 
	public String getGioithieu() {
		return gioithieu;
	} public void setGioithieu(String gioithieu) {
		this.gioithieu = gioithieu;
	} public String getNhanvat() {
		return nhanvat;
	} public void setNhanvat(String nhanvat) {
		this.nhanvat = nhanvat;
	} public int getWidth() {
		return width;
	} public void setWidth(int width) {
		this.width = width;
	} public String getQuyluat() {
		return quyluat;
	} public void setQuyluat(String quyluat) {
		this.quyluat = quyluat;
	} public int getPauseState() {
		return pauseState;
	} 

	// phuong thuc ve  chia khoa 
    public void setupGame() {
    	asset.setObject();
    	playMusic(0);
    	gameState = playState;
    }
    
     public void startGame() {
    	 thread0 = new Thread(this);
    	 thread0.start();
     }
     @Override
 	public void run() {
 			while(thread0 != null) {
 				update();
 				 repaint();
 		            try {
 		                Thread.sleep(30);
 		            } catch (InterruptedException ex2) {
 		            } 
 			      }
 	}
     
     // audio 
     // phat
     public void playMusic(int i) {
    	 music.setFile(i);
    	 music.play();
    	 music.loop();
     }
     // dung
     public void stopMusic() {
    	 music.stop();
     }
     // lay vi tri mang music
     public void playse(int i) {
    	 se.setFile(i);
    	 se.play();
     }
     
    
     
     
     
     
    
    // draw cac thành phần 
	public void paintComponent(Graphics  g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        g2.fillRect(0, 0, WIDTH, HEIGHT);
       
        if(countKey.endgame == true) {
        	
        	
           button = new JButton("lưu kết quả");
           button.addActionListener(this);
           button.setFont(new Font("Arial", Font.BOLD,20));
       	   add(button);
       	   Dimension buttonSize = button.getPreferredSize();
       	   Dimension gameSize = getSize();
       	   button.setBounds(320, 320,150,50);
       	   
               button.setBackground(Color.blue);
               button.setForeground(Color.yellow);
               
                
             
               
              
        }
        
        
        tilemanager.draw(g2);
        
        for(int i=0; i<obj.length ; i++) {
        	if(obj[i] != null) {
        		obj[i].draw(g2, this);
        	}
        }
        
         player.draw(g2);
         countKey.draw(g2);
        
         
        g2.dispose();
        
        
        
    }
          
          public void update() {
        	 
        	 if(gameState == playState) {
        		 player.update();
        	 }else 
        	 if(gameState == pauseState) {
//        		 nothing 
        	}
          }
          
          
          public void save() {
//         	    login = new MatKhau();
     		 try {
     				Connection connection= JDBC.getConnection();
     				Statement statement = connection.createStatement();
     				 
     				
     				String update = "update nguoidung set "
     						+ "time  = time*0 + "     + countKey.time
     						+ " WHERE  username = 'admin'    "   
     						+ ";"; 
     				
     				
//     				System.out.println(update);
     				int soDong= statement.executeUpdate(update);
     				if(soDong>0) {
     					System.out.println("Lưu kết quả thành công");
     				}else {
     					System.out.println("that bai");
     				}
     				JDBC.closeConnection(connection);
     				
     			} catch (Exception e2) {
     				// TODO: handle exception
     				e2.printStackTrace();
     			}
     	 
     		 
     	}
   

     
    public static void main(String[] args) {
        frame = new JFrame("leo nui cuoi ky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH+20, HEIGHT+40));
        frame.setContentPane(new Run());
        frame.pack();
        frame.setLocationRelativeTo(null);
        
        
       
        
        frame.setVisible(true);
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			save();
		}
	}

 
    



	 
}

