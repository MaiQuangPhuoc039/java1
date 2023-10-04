package vd;

import javax.imageio.ImageIO;

public class ObjDoor extends SuperObject {

	   public ObjDoor() {
		   name = "Door";
		   try {
			img = ImageIO.read(getClass().getResourceAsStream("door3.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		   cham = true;
	   }
}
