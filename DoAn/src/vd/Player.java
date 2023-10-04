package vd;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Player extends Emty {
       public int screenX;
       public int screenY;
       public int hasKey =0;;
       
       public Run run ;
       public Key key;
       
       
       
       
       
       
	public Player(Run run , Key key) {
		this.run = run;
		this.key = key;
		
		screenX = run.width/2 - run.size/2;
		screenY = run.height/2 - run.size/2;
		
		
		solid = new Rectangle();
		solid.x = 8;
		solid.y = 16 ;
		solid.width = 32;
		solid.height= 32;
		solidAreaDefaultX = solid.x;
		solidAreaDefaultY = solid.y;
		
		
		
		// cap nhap vi tri nguoi choi
		getDe();
		getImage();
		
	}
	
	public void getDe() {
		worldX = run.size*23;
		worldY = run.size*27;
		
		speed = 10;
		
		huong = "dow";
	}
	
	
	public void getImage() {
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
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void update() {
		if(key.upPre == true || key.leftPre == true || key.rightPre == true || key.dowPre== true) {
			
			if(key.upPre== true) {
				huong = "up";
			}
			if(key.leftPre== true) {
				huong = "left";
			}
			if(key.rightPre== true) {
				huong = "right";
			}
			if(key.dowPre== true) {
				huong = "dow";
			}
			
			
			cham = false;
			run.checkCham.check(this);
			
			int objIndex = run.checkCham.checkObj(this, true);
			pickUpObj(objIndex);
			
			if(cham == false) {
				switch (huong) {
				case "up": 
					worldY -= speed;
					break;
				case "left": 
					worldX -= speed;
					break;
				case "right": 
					worldX += speed;
					break;
				case "dow": 
					worldY += speed;
					break;
				}
//				end switch case s
				
			}
			soluong++;
			if(soluong>10) {
				if(maso == 1){
					maso=2;
				}else if(maso == 2) {
					maso = 1;
				}
				soluong = 0;
			}
			
		}
	}
//	end update
	
	public void pickUpObj(int i) {
		if(i != 999) {
			String objName = run.obj[i].name;
		    switch (objName) {
			case "Key": 
				hasKey++;
				run.countkey.boolkey = true;
				run.playSE(1);
				System.out.println("hasKey : "+hasKey);
				run.obj[i] = null;
				break;
			case "Door":
				run.countkey.booldoor1  = true;
				if(hasKey > 0 ) {
					run.obj[i]= null;
					run.playSE(2);
					hasKey --;
					run.countkey.booldoor  = true;

				}
				break;
			case "Chest":
				run.playSE(3);
				run.obj[i] = null;
				run.countkey.boolchest = true;
				run.countkey.end = true;
				run.stopMusic();
				
				break;
			}
		}
	}
	
	
	
	public void draw(Graphics2D g2 ) {
//		g2.setColor(Color.red);
//		g2.fillRect(x, y, run.size, run.size);
		
		BufferedImage img  = null;
		switch (huong) {
		case "up":  
			if(maso == 1) {
				img = up1 ;
			}
			if(maso == 2) {
				img = up2;
			}
			break;
		case "dow":  
			if(maso == 1) {
				img = dow1 ;
			}
			if(maso == 2) {
				img = dow2;
			}
			break;
		case "left":  
			if(maso == 1) {
				img =left1 ;
			}
			if(maso == 2) {
				img = left2;
			}
			break;
		case "right":  
			if(maso == 1) {
				img = right1 ;
			}
			if(maso == 2) {
				img = right2;
			}
			break;
		}
		//	end switch case
		
		g2.drawImage(img, screenX, screenY, run.size, run.size, null);
	}

	
	
	
	
	
       
       
       
}
