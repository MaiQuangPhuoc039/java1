package Main;

import javax.imageio.ImageIO;

public class ObjBoot extends SuperObject {
	
	public ObjBoot () {
		name = "Boot";
		try {
			img =  ImageIO.read(getClass().getResourceAsStream("boot.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
