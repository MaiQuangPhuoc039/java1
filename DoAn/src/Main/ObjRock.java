package Main;

import javax.imageio.ImageIO;

public class ObjRock extends SuperObject {
	
	public ObjRock () {
		name = "Rock";
		try {
			img =  ImageIO.read(getClass().getResourceAsStream("door4.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		cham = true;
	}	

}
