package Main;

import javax.imageio.ImageIO;

public class ObjHammer extends SuperObject {
	
	public ObjHammer () {
		name = "Hammer";
		try {
//			img =  ImageIO.read(getClass().getResourceAsStream("pickaxe1.png"));
			img =  ImageIO.read(getClass().getResourceAsStream("bua.png"));    // buata2
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
