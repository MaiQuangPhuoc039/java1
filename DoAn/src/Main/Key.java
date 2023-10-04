package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;

public class Key implements KeyListener {
	public   boolean paused = false;
	
	
	// boolean cho up dow left right 
	public static boolean upPre  ,dowPre ,leftPre,rightPre, xml ;
    
	public Run run;
	

	public Key(Run run) {
		this.run = run;
	}
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// sự kiện keylistener
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code =  e.getKeyCode();
		if(code == KeyEvent.VK_UP) {
			upPre = true;
		}
		if(code == KeyEvent.VK_LEFT) {
			leftPre = true;
		}
		if(code == KeyEvent.VK_RIGHT) {
			rightPre = true;
		}
		if(code == KeyEvent.VK_DOWN) {
			dowPre = true;
		}
		if(code == KeyEvent.VK_O) {
			JOptionPane.showMessageDialog(null, "thoat");
		   System.exit(0);
	    }
		if(code == KeyEvent.VK_X) {
			 xml =  true;
		}
		
		 
		
		
		
		
		
//	if(code == KeyEvent.VK_ESCAPE){
//         if(run.pause==false){
//        	 run.pause=true;
//        	 run. inputFile();
//         }else{
//        	 run.pause=false;
//        	 run.balls[0].vy = run.balls[1].vy =run.balls[2].vy=run.balls[3].vy=run.balls[4].vy=run.balls[9].vy= run.balls[10].vy=run.balls[11].vy= run.balls[12].vy= run.balls[13].vy=run.balls[14].vy=run.balls[15].vy= run.balls[16].vy=run.balls[17].vy= run.balls[18].vy= run.balls[19].vy=run.balls[24].vy=1;
//        	 run.vy=4;
//         }
//     }
//     if(code == KeyEvent.VK_ENTER){
//        
//    	 run.outputFile();
//     }
}
 
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int code =  e.getKeyCode();
		if(code == KeyEvent.VK_UP) {
			upPre = false;
		}
		if(code == KeyEvent.VK_LEFT) {
			leftPre = false;
		}
		if(code == KeyEvent.VK_RIGHT) {
			rightPre = false;
		}
		if(code == KeyEvent.VK_DOWN) {
			dowPre = false;
		}
		if(code == KeyEvent.VK_P) {
		     if(run.gameState ==  run.playState) {
		    	 run.gameState = run.pauseState;
		    	 
		     }
		     else if(run.gameState ==  run.pauseState) {
		    	 run.gameState = run.playState;
		     }
		}
		if(code == KeyEvent.VK_X) {
			 xml = false;
		}
		
	}
	
	public void draw(Graphics2D g2) {
		 
		 
        
        	  Font font = new Font("Arial" , Font.BOLD, 35);
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString(" PAUSED  "  ,run.player.screenX , run.player.screenY);
      			 
	}






	 
	 





 

	

}
