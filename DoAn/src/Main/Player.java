package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;

public class Player extends Emty  {
	
//	 public static int soluong =0;
//		public static int maso  = 1;
		public static  Run run ;
		public docxml doc = new docxml();
		public Key key;
		public int hasKey =0;
		public int hasHammer= 0 , hasXen=0;
		public boolean finished = false;
	 
		
		// toa do x y nhan vat baby
		public  int screenX  ;
		public   int screenY;
//		DecimalFormat decimal = new DecimalFormat("#0.00");
		
		// demo  toa do nhan vat
		
		
//		Font font2 , font ;
	    
		public Player(Run run, Key key) {
			this.run = run;
			this.key = key;
			
			//  xét vị trí giữa màn hình và gán cho nhân vật 
	    	screenX = run.width/2 - (run.size/2);
			screenY = run.height/2 - (run.size/2);
			
			
			
			
			solid = new Rectangle();
		 	// xu li va cham 
	    	 solid = new Rectangle();
	    	 solid.x = 8;
	    	 solid.y = 14;
	    	 solidAreaDefaultX = solid.x;
	    	 solidAreaDefaultY = solid.y;
	    	 solid.width = 32;
	         solid.height = 32; 
			
			getDe();
			getPlayImg();
		}
		
		public void getDe() {
			// camera di chuyen  
			// cập nhập vị trí người chơi luc bandau
			 worldX = run.size * 32 ;
			 worldY = run.size * 42;
			   
			 speed = 9;
			 
			 // huong  ban dau la dow
			 huong = "dow";
		}
		
		public void getPlayImg() {
			try {
				
	    		// anh nhân vật người chơi kết hợp animation
				up1    = ImageIO.read(getClass().getResourceAsStream("len1.png"));
				up2    = ImageIO.read(getClass().getResourceAsStream("len2.png"));
				left1  = ImageIO.read(getClass().getResourceAsStream("trai1.png"));
				left2  = ImageIO.read(getClass().getResourceAsStream("trai2.png"));
				right1 = ImageIO.read(getClass().getResourceAsStream("phai1.png"));
				right2 = ImageIO.read(getClass().getResourceAsStream("phai2.png"));
				dow1   = ImageIO.read(getClass().getResourceAsStream("xun1.png"));
				dow2   = ImageIO.read(getClass().getResourceAsStream("xun2.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void draw(Graphics2D g2) {
		 
			BufferedImage img = null;
			switch ( huong) {
			case  "up" :
				if(maso == 1) {
					img = up1;
				}
				  if(maso == 2) {
					img = up2;
				}
			    break;
			case  "dow" : 
				if(maso == 1) {
					img = dow1;
				}
				  if(maso == 2) {
					img = dow2;
				}
			    break;
			case  "left"  :
				if(maso == 1) {
					img = left1;
				}
				  if(maso == 2) {
					img = left2;
				}
			    break;
			case  "right" :
				if(maso == 1) {
					img = right1;
				}
				  if(maso == 2) {
					img = right2;
				}
			    break;
			}  
		g2.drawImage( img, screenX , screenY , run.size, run.size, null);
	 
           
		}
		
		  public   void update() {
        	if( Key.upPre == true || Key.dowPre == true||Key.leftPre == true||Key.rightPre == true || Key.xml == true ) {
       		
       		if( Key.upPre == true) {
       			huong = "up";
       		}else if( Key.dowPre == true ) {
       			huong = "dow";
       		}else if ( Key.leftPre == true ) {
       			huong = "left";
       		}else if ( Key.rightPre == true) {
       			huong = "right";
       		} 
       		else if ( Key.xml == true) {
       			System.out.println(run);
       		} 
       		
       		
       		
       		
//       		 check collision 
       		cham = false;
       		run.checkCham.check(this);
       		
       		// check obj collision
       		int objIndex = run.checkCham.checkObj(this, true);
       		pickUpObj(objIndex);  
       		 
//       		if collision is false , player can move 
       		if(cham == false) {
       			switch ( huong) {
       			case  "up" :
       				worldY  -= speed ;
       			    break;
       			case  "dow" : 
       				worldY +=speed ;
       			    break;
       			case  "left"  :
       				worldX -=  speed;
       			    break;
       			case  "right"  :
       				worldX +=  speed;
       			    break;
       			
       			}  
       		} 
       		 
       			
//       	animation babay
       		soluong++;
       		if(soluong > 5 ) {
       			if(maso == 1) {
       				maso = 2;
       			}else if(maso == 2) {
       				maso =1;
       			}
       			soluong = 0;
       		}
        }
   }
		  
		  public void pickUpObj(int i ) {
			  if(i !=  999) {
				 String objName = run.obj[i].name;
				 switch (objName) {
				 case "Key" :
					 run.playse(1);
					 hasKey++;
					 run.countKey.key = true;
					 run.obj[i] = null;
//					 System.out.println("KEY :"+hasKey);
					 break;
				 case "Door": 
					 run.playse(2);
					 if(hasKey > 0 ) {
						 run.obj[i] = null;
						 run.countKey.door= true;
						 hasKey --;
						 
					 }
					 else {
						 run.countKey.door0= true;
					 }
//					 System.out.println("KEY :"+hasKey);
				     break;
				 case "Boot": 
					 run.playse(3);
					     speed+=2;
						 run.obj[i] = null;
						 
				     break;
				 case "Axe": 
					 run.obj[i] = null; 
					 
					 run.playse(7);
					  
				     break;
				 case "Chest": 
					run.obj[i] = null;
					
					 run.countKey.endgame = true;
					 run.countKey.finished= true; 
//					run.playMusic(7);
					run.stopMusic();
					run.playse(4);
				     break;
				 case "Hammer" :
					 run.playse(1);
					 hasHammer++;
					 run.countKey.hammer = true;
					 run.obj[i] = null;
//					 System.out.println("HAMMER :"+hasHammer);
					 break;
					 
				 case "Xen" :
					 run.playse(1);
					 hasXen++;
					 run.countKey.xen = true;
					 run.obj[i] = null;
//					 System.out.println("XEN  :"+hasXen);
					 break;
					 
				  
				 case "Gai": 
//						run.obj[i] = null;
//						lost = true;
						run.countKey.endgame= true;
						run.countKey.gameOver = true;
//						run.playse(6);	
						run.stopMusic();
						run.playse(5);
					     break;
			        
				 case "Rock": 
					 run.playse(2);
					 if(hasHammer > 0 ) {
						 run.playse(8);
						 run.obj[i] = null;
						 run.countKey.rock= true;
						 hasHammer --;
//						 System.out.println("HAMMER :"+hasHammer);
						 
					 }else {
						 run.countKey.kipno1 = true;
					 }
					     break;
					     
				 case "Kipno": 
				 
					
					 if(hasXen > 0 ) {
						 run.playse(8);
						 run.obj[i] = null;
						 run.countKey.kipno= true;
						 hasXen --;
//						 System.out.println("XEN  :"+hasHammer);
						 
					 }else {
						 run.countKey.kipno0= true;
					 }
					     break;
					     
					     
				 case "Bom": 
						run.obj[i] = null;
//						lost = true;
						run.countKey.endgame= true;
						run.countKey.gameOver = true;
						run.playse(6);
						run.stopMusic();
						run.playse(5);
					     break;
			  }
		  }
		
		  }

}
