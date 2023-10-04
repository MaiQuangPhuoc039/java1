package Main;

import javax.imageio.ImageIO;

public class ObjXen extends SuperObject {
	
	public ObjXen () {
		name = "Xen";
		try {
			img =  ImageIO.read(getClass().getResourceAsStream("shovel.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		 cham = true;
	}

}
