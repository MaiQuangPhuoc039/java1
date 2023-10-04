package Main;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Emty extends Tile {
	public static int worldX;
	public static int worldY   ,speed;
	public BufferedImage   up1,up2,left1,left2,right1,right2,dow1,dow2;
	public static boolean upPre  ,dowPre ,leftPre,rightPre;
    public static String huong ;
	public  int soluong=0, maso=1;
	public Rectangle solid ;
//	public Rectangle soidArea;
	public int solidAreaDefaultX =0; 
	public int solidAreaDefaultY =0;
	
	public static boolean cham = false;
	
	 
}
