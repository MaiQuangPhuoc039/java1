package Main;

import javax.imageio.ImageIO;

public class ObjGai extends SuperObject {
	
	public ObjGai () {
		name = "Gai";
		try {
			img =  ImageIO.read(getClass().getResourceAsStream("snake.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	  cham = true;
	}

}
