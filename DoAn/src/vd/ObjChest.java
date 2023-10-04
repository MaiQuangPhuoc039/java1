package vd;

import javax.imageio.ImageIO;

public class ObjChest extends SuperObject {
      public ObjChest() {
    	  name = "Chest";
    	  try {
			img = ImageIO.read(getClass().getResourceAsStream("chest.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
      }
}
