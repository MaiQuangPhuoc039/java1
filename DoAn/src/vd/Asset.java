package vd;

public class Asset {
	
	public Run run ;
	
	public Asset (Run run ) {
		this.run = run;
	}
	
	 public void setObj() {
		 run.obj[0] = new ObjKey();
		 run.obj[0].worldX =  28*run.size;
		 run.obj[0].worldY = 27 * run.size;
		 
		 run.obj[1] = new ObjDoor();
		 run.obj[1].worldX = 18* run.size;
		 run.obj[1].worldY= 27 * run.size;
		 
		 run.obj[2] = new ObjChest();
		 run.obj[2].worldX = 14 * run.size;
		 run.obj[2].worldY = 27 * run.size;
	 }
	 
	
}
