package vd;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class SuperObject {
    public Run run ;
//    public  Asset asset = new Asset(run); 
    public String name ;
    public boolean cham =false;
    public Rectangle solidArea= new Rectangle(0,0,48,48);
    BufferedImage img ;
    public int solidAreaDefaultX  =0, solidAreaDefaultY =0;
    public int worldX , worldY;
    
    
    public void draw(Graphics2D g2, Run run) {
    	int screenX = worldX - run.player.worldX + run.player.screenX;
    	int screenY = worldY - run.player.worldY + run.player.screenY;

    	
//    	if(worldX + run.size > run.player.worldX - run.player.screenX && 
//    			   worldX - run.size < run.player.worldX + run.player.screenX && 
//    			   worldY + run.size > run.player.worldY - run.player.screenY && 
//    			   worldY - run.size < run.player.worldY + run.player.screenY ) {
//    				g2.drawImage( img,screenX , screenY , run.size, run.size , null );
//    			}
		g2.drawImage( img,screenX , screenY , run.size, run.size , null );

    			
    }
}
