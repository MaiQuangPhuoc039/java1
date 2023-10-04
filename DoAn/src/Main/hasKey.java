package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;

public class hasKey extends JPanel implements ActionListener {
      public  Run run ;
      public String  text ="you redmoved it  !";
      public String  text1 ="you need a hammer !";
      
      public boolean endgame = false;
      public boolean door = false, xen= false ;
      public boolean rock = false,hammer = false,kipno1= false, kipno=false , kipno0= false  , door0= false;
      public boolean pause= false;
      public boolean gameOver = false;
      public boolean finished = false;
      public boolean key = false ;
      public int countKey =0, countKipno1=0, countDoor = 0 , countRock= 0, countXen=0 , countHammer =0 , countKipno=0, countKipno0=0, countDoor0=0;
      
      Font  font , font2 ;
      BufferedImage keyimg;
      BufferedImage hammerimg;
      BufferedImage xenimg;
       public double time  =0;
       DecimalFormat decimal =  new DecimalFormat("#0.00") ;
	private JButton button;
	private JPanel panel ;
	private JFrame frame = new JFrame();
	 
      public hasKey(Run run ) {
    	  this.run = run;
    	  
    	  // vat pham thu nhap duoc
    	   font = new Font("Arial" , Font.BOLD, 40);
    	   ObjKey objkey  = new ObjKey();
    	   keyimg = objkey.img;
    	   
    	   font = new Font("Arial" , Font.BOLD, 40);
    	   ObjHammer Objhammer  = new ObjHammer();
    	   hammerimg = Objhammer.img;
    	   
    	   font = new Font("Arial" , Font.BOLD, 40);
    	   ObjXen objXen  = new ObjXen();
    	   xenimg = objXen.img;
      }
      
      public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public void draw(Graphics2D  g2 ) {
    	  font = new Font("Arial" , Font.BOLD, 20);
    	  
    	  
    	  
    	  g2.setFont(font);
    	  g2.setColor(Color.yellow);
    	   
    	  
    	  g2.drawImage(keyimg, run.size/2, run.size/2, run.size-20, run.size-20,  null);
    	  g2.drawString(" x "+run.player.hasKey, 60 , 50);
    	  
    	  g2.drawImage(hammerimg, run.size/2, run.size+20,  run.size-20, run.size-20, null);
    	  g2.drawString(" x "+run.player.hasHammer, 60 , 90);
    	  
    	  g2.drawImage(xenimg, run.size/2-10, run.size+50,  run.size-10, run.size-10, null);
    	  g2.drawString(" x "+run.player.hasXen, 60 , 125);
    	  
    	  
    	  
    	  
    	  if(finished == true) {
    		  g2.setColor(Color.getHSBColor(102, 163, 255));
     		  g2.fillRect(0, 0, run.width,run.height);
     		  
//    		  font = new Font("Arial" , Font.BOLD, 80);
    		  g2.setFont(g2.getFont().deriveFont(Font.BOLD, 80f));
    		  
//    		  g2.setColor(Color.black);
        	  g2.setColor(Color.yellow);
        	  g2.drawString("You Win", 245 , 225);
    	  }
    	  
    	  
    	  if(gameOver == true) {
    		  
    		  g2.setColor(Color.getHSBColor(102, 163, 255));
    		  g2.fillRect(0, 0, run.width,run.height);
    		  
//    		  font = new Font("Arial" , Font.BOLD, 80);
    		  g2.setFont(g2.getFont().deriveFont(Font.BOLD, 80f));
    		  
//    		  g2.setColor(Color.black);
        	  g2.setColor(Color.yellow);
        	  g2.drawString("Game Over", 205 , 225);
    	  }
    	  
    	  
    	  // end  game 
    	  if(endgame  ==  true) {
    		  
//    		  g2.setColor(Color.black);
//    		  g2.fillRect(0, 0, run.width,run.height);
//    		  
    		      
            	  font = new Font("Arial" , Font.BOLD, 80);
            	  font2 = new Font("Arial" , Font.BOLD, 30);
            	 
            	  time += (double )1/60;
            	  g2.setFont(font2);
            	  g2.drawString(" completion time : "+ decimal.format(time), 269 , 295);
            	 
            	  
            	 
              
            	  
            	
            run.thread0 = null;
    	  }
    	  else   {
    		  
        		  time += (double )1/60;
            	  font2 = new Font("Arial" , Font.BOLD, 25);
            	  g2.setColor(Color.white);
            	  g2.setFont(font2);
            	  g2.drawString(" Time : "+ decimal.format(time), run.size*11 + 90 , 45);
            	  
             
        	    
    	  }
    	  
    	 
    	   
    	  
    	  if(key == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
         	 countKey++;
         	 if(countKey > 80) {
         		 key = false;
         	 }
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString("you collect the key !", 105 , 295);
        	  
    	  }
    	  
    	  if(kipno0 == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
         	 countKipno0++;
         	 if(countKipno0 > 80) {
         		 kipno0 = false;
         	 }
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString("you need a shovel !", 105 , 295);
        	  
    	  }
    	  
    	  if(door0 == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
         	 countDoor0 ++;
         	 if(countDoor0 > 80) {
         		door0 = false;
         	 }
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString("you need a key !", 105 , 295);
        	  
    	  }
    	  
    	  if(hammer == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
         	 countHammer++;
         	 if(countHammer > 80) {
         		 hammer = false;
         	 }
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString("you collect the hammer !", 105 , 295);
        	  
    	  }
    	  
    	  if(door == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
    		  countDoor ++;
    			 if(countDoor > 80) {
             		 door = false;
             	 } 
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString("you opened the door !", 105 , 295);
    	  } 
    	  
    	  
    	  if(rock == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
    		  countRock++;
    			 if(countRock > 80) {
             		 rock = false;
             	 } 
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString("you broke the rock !", 105 , 295);
    	  } 
    	  
    	  if(xen == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
    		  countXen++;
    			 if(countXen > 80) {
    				 xen = false;
             	 } 
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString("you have collected the shovel!", 105 , 295);
    	  } 
    	  
    	  if(kipno == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
    		  countKipno++;
    			 if(countKipno > 80) {
    				 kipno = false;
             	 } 
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString( text, 105 , 295);
    	  } 
    	  
    	  if(kipno1 == true) {
    		  font = new Font("Arial" , Font.BOLD, 20);
    		  countKipno1++;
    			 if(countKipno1 > 80) {
    				 kipno1 = false;
             	 } 
        	  g2.setFont(font);
        	  g2.setColor(Color.white);
        	  g2.drawString( text1, 105 , 295);
    	  } 
    	  
    	  
    	 
    	  
    	  if(run.gameState == run.playState) {
    		  
    	  }
    	  if(run.gameState == run.pauseState) {
    		  Font font = new Font("Arial" , Font.BOLD, 55);
        	  g2.setFont(font);
        	  g2.setColor(Color.YELLOW);
        	  g2.drawString(" PAUSED  "  ,run.player.screenX-50 , run.player.screenY-30);
    	  }
    	 
      }

	private Graphics2D getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
      
}
