package Main;

public class AssetSetter {
     public Run run;
	public AssetSetter(Run run) {
		this.run = run;
	}
	
	public void setObject() {
		
		
		// ve chia khoa bang mang 
		run.obj[0] = new ObjKey();
		run.obj[0].worldX =  28 * run.size;
		run.obj[0].worldY = 22 * run.size;
		
		run.obj[1] = new ObjKey();
		run.obj[1].worldX =  30* run.size;
		run.obj[1].worldY = 32 * run.size;
		
		run.obj[2] = new ObjKey();
		run.obj[2].worldX =  38* run.size;
		run.obj[2].worldY = 15 * run.size;
		
		run.obj[3] = new ObjDoor();
		run.obj[3].worldX =  21 * run.size;
		run.obj[3].worldY = 42 * run.size;
		
		
		run.obj[4] = new ObjDoor();
		run.obj[4].worldX =  29* run.size;
		run.obj[4].worldY = 24 * run.size;
		
		run.obj[5] = new ObjDoor();
		run.obj[5].worldX =  38* run.size;
		run.obj[5].worldY = 9 * run.size;
		
		run.obj[6] = new ObjChest();
		run.obj[6].worldX =  10 * run.size;
		run.obj[6].worldY =  10 * run.size;
		

		run.obj[7] = new  ObjBoot();
		run.obj[7].worldX =  37 * run.size;
		run.obj[7].worldY =  41 * run.size;
		
		run.obj[8] = new  ObjBom();
		run.obj[8].worldX =  31 * run.size;
		run.obj[8].worldY =  34 * run.size;
		
		run.obj[19] = new  ObjBom();
		run.obj[19].worldX =  13 * run.size;
		run.obj[19].worldY =  42 * run.size;
		
		 
		
		run.obj[9] = new  ObjBom();
		run.obj[9].worldX =  9 * run.size;
		run.obj[9].worldY =  36 * run.size;
		
		run.obj[10] = new  ObjBom();
		run.obj[10].worldX =  33 * run.size;
		run.obj[10].worldY =  40 * run.size;
		
		run.obj[11] = new  Objaxe();
		run.obj[11].worldX =  11 * run.size;
		run.obj[11].worldY =  38 * run.size;
		
		run.obj[12] = new  ObjHammer();
		run.obj[12].worldX =  18 * run.size;
		run.obj[12].worldY = 35 * run.size;
		
		run.obj[13] = new  ObjRock();
		run.obj[13].worldX =  10 * run.size;
		run.obj[13].worldY =  13 * run.size;
		
		run.obj[14] = new  ObjGai();
		run.obj[14].worldX =  22 * run.size;
		run.obj[14].worldY =  6 * run.size;
		
		run.obj[18] = new  ObjGai();
		run.obj[18].worldX =  24 * run.size;
		run.obj[18].worldY =  6 * run.size;
		
		run.obj[15] = new  ObjXen();
		run.obj[15].worldX =  40 * run.size;
		run.obj[15].worldY =  9 * run.size;
		
		
		run.obj[16] = new  ObjXen();
		run.obj[16].worldX =  23 * run.size;
		run.obj[16].worldY =  6 * run.size;
		
		run.obj[17] = new  ObjKipno();
		run.obj[17].worldX =  18 * run.size;
		run.obj[17].worldY =  40 * run.size;
		
		
		 
	 
	}
     
     
}
