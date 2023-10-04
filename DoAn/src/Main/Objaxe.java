package Main;

import javax.imageio.ImageIO;

public class Objaxe extends SuperObject {
	
	public Objaxe () {
		name = "Axe";
		try {
			img =  ImageIO.read(getClass().getResourceAsStream("co1.png"));  // co1
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
