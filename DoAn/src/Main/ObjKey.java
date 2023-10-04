package Main;

import javax.imageio.ImageIO;

public class ObjKey extends SuperObject {
	 
	public ObjKey () {
		name = "Key";
		try {
			img =  ImageIO.read(getClass().getResourceAsStream("key1.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public String toString() {
		return "ObjKey"
				+ "\n name : " + name 
				+ "\n sollision : " + cham 
				+ "\n X : " + x1 + ", Y : " + y1
				+ "\n X : " + x2 + ", Y : " + y2 
				+ "\n X : " + x3 + ", Y : " + y3 
				+ "\n solidArea : " + Rec +"\n" ;
	}

}
