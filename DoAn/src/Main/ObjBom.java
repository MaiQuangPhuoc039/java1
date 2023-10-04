package Main;

import javax.imageio.ImageIO;

public class ObjBom extends SuperObject {
	
	public ObjBom () {
		name = "Bom";
		try {
			img =  ImageIO.read(getClass().getResourceAsStream("min.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public String toString() {
		return "\n ObjBom "
				+ "\n name : " + name 
				+ "\n sollision : " + cham1 
				+ "\n X : " + x1 + ", Y : " + y1
				+ "\n X : " + x2 + ", Y : " + y2 
				+ "\n X : " + x3 + ", Y : " + y3 
				+ "\n solidArea : " + Rec +"\n" ;
	}

}
