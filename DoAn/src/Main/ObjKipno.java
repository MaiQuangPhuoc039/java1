package Main;

import javax.imageio.ImageIO;

public class ObjKipno extends SuperObject {
	
	public ObjKipno () {
		name = "Kipno";
		try {
			img =  ImageIO.read(getClass().getResourceAsStream("nho.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		cham = true; 
	}

}
