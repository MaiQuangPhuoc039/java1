package Main;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class SuperObject {
 public Run run ;
	 public AssetSetter  ass = new AssetSetter(run);
	
	public BufferedImage img ;
	public String name ;
	public  boolean  cham;
	public int worldX, worldY;
	public Rectangle solidArea =  new Rectangle(0,0,48,48);
	public int solidAreaDefaultX =0; 
	public int solidAreaDefaultY =0;
	
	public int x = worldX;
	public String x1 = String.valueOf(x);
	public int y = worldY;
	public String y1 = String.valueOf(y);
	
	public int x12 = worldX;
	public String x2 = String.valueOf(x12);
	public int y12 = worldY;
	public String y2 = String.valueOf(y12);
	
	public int x13 = worldX;
	public String x3 = String.valueOf(x13);
	public int y13 = worldY;
	public String y3 = String.valueOf(y13);
	
    public String Rec = String.valueOf(solidArea);
    public String cham1 = String.valueOf(cham);
	 
	
	


	@Override
	public String toString() {
		return " -----------------------------------\n Object \n ---------------------------------- \n"
				+ "\n Name : " + name 
				+ "\n\n Sollision : " + cham1 
				+ "\n\n X1 : " + x1 + "     , Y1 : " + y1
				+ "\n\n X2 : " + x2 + "    , Y2 : " + y2 
				+ "\n\n X3 : " + x3 + "    , Y3 : " + y3 
				+ "\n\n SolidArea : " + Rec +"\n" ;
	}

	
	
	public String getCham1() {
		return cham1;
	}



	public void setCham1(String cham1) {
		this.cham1 = cham1;
	}

	public String getX2() {
		return x2;
	}



	public void setX2(String x2) {
		this.x2 = x2;
	}



	public String getY2() {
		return y2;
	}



	public void setY2(String y2) {
		this.y2 = y2;
	}



	public String getX3() {
		return x3;
	}



	public void setX3(String x3) {
		this.x3 = x3;
	}



	public String getY3() {
		return y3;
	}



	public void setY3(String y3) {
		this.y3 = y3;
	}



	public String getRec() {
		return Rec;
	}



	public void setRec(String rec) {
		Rec = rec;
	}



	public String getX1() {
		return x1;
	}



	public String getY1() {
		return y1;
	}



	public void setY1(String y1) {
		this.y1 = y1;
	}



	public void setX1(String x1) {
		this.x1 = x1;
	}



	public BufferedImage getImg() {
		return img;
	}


	public void setImg(BufferedImage img) {
		this.img = img;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isCham() {
		return cham;
	}


	public void setCham(boolean cham) {
		this.cham = cham;
	}


	public int getWorldX() {
		return worldX;
	}


	public void setWorldX(int worldX) {
		this.worldX = worldX;
	}


	public int getWorldY() {
		return worldY;
	}


	public void setWorldY(int worldY) {
		this.worldY = worldY;
	}


	public Rectangle getSolidArea() {
		return solidArea;
	}


	public void setSolidArea(Rectangle solidArea) {
		this.solidArea = solidArea;
	}


	public int getSolidAreaDefaultX() {
		return solidAreaDefaultX;
	}


	public void setSolidAreaDefaultX(int solidAreaDefaultX) {
		this.solidAreaDefaultX = solidAreaDefaultX;
	}


	public int getSolidAreaDefaultY() {
		return solidAreaDefaultY;
	}


	public void setSolidAreaDefaultY(int solidAreaDefaultY) {
		this.solidAreaDefaultY = solidAreaDefaultY;
	}


	 

	public void draw(Graphics2D g2,  Run run) {
		int screenX = worldX - run.player.worldX + run.player.screenX;
		int screenY = worldY - run.player.worldY +  run.player.screenY;
		
		
//		 tao do muot cho game (khong quan trong ) 
//		if(worldX + run.size > run.player.worldX - run.player.screenX && 
//		   worldX - run.size < run.player.worldX + run.player.screenX && 
//		   worldY + run.size > run.player.worldY - run.player.screenY && 
//		   worldY - run.size < run.player.worldY + run.player.screenY ) {
//			g2.drawImage( img,screenX , screenY , run.size, run.size , null );
//		}
		g2.drawImage( img,screenX , screenY , run.size, run.size , null );

	}

}
