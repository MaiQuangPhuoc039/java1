package vd;

import javax.imageio.ImageIO;

public class ObjKey extends SuperObject{
	public ObjKey() {
		name = "Key";
		try {
			img = ImageIO.read(getClass().getResourceAsStream("Key1.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
