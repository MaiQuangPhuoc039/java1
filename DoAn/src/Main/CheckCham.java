package Main;

public class CheckCham {
	
	public Run run ;
	public Emty emty;

	public CheckCham(Run run ) {
		 this.run = run ;
	}
	
	public void check(Emty emty ) {
		
		
//		 tìm ra solid bé trong baby ( tọa độ x y solid  baby )
		int emtyLeftWorldX = emty.worldX + emty.solid.x;
		int emtyRightWorldX = emty.worldX + emty.solid.x  + emty.solid.width;
		int emtyTopWorldY = emty.worldY + emty.solid.y;
		int emtyBotWorldY = emty.worldY + emty.solid.y +  emty.solid.height;
		
		// tìm ra số cột và hàng của chúng  -> vd : 23 , 23 , 21 ,21 vị trí các ô 
		int emtyLeftCol = emtyLeftWorldX/ run.size;
		int emtyRightCol = emtyRightWorldX/ run.size;
		int emtyTopRow = emtyTopWorldY / run.size;
		int emtyBotRow = emtyBotWorldY/ run.size;
		
		// tạo ra 2 ô (dự đoán ô sẻ bước đến )
		int tilenum1 , tilenum2;
		
		switch (emty.huong) {
		case  "up" :
			// cập nhật ô baby muốn đến
			emtyTopRow = (emtyTopWorldY - emty.speed )/run.size;
			
			// đi lên thì kiểm ra left top right don't check dow
//		 tọa độ này  là toak độ dự đoán cho va chạm 
			
			tilenum1 = run.tilemanager.mapTileMun[emtyLeftCol][emtyTopRow];
			tilenum2 = run.tilemanager.mapTileMun[emtyRightCol][emtyTopRow];
			
			//  if 1 or 2 collisionoOn  than collisionOn is true and don't go on 
			if(run.tilemanager.tile[tilenum1].cham == true || run.tilemanager.tile[tilenum2].cham == true) {
				emty.cham = true;
			}
			break;
		case  "dow" :
			// cập nhật ô baby muốn đến
			emtyBotRow = (emtyBotWorldY + emty.speed )/run.size;
						
			tilenum1 = run.tilemanager.mapTileMun[emtyLeftCol][emtyBotRow];
			tilenum2 = run.tilemanager.mapTileMun[emtyRightCol][emtyBotRow];
						
			if(run.tilemanager.tile[tilenum1].cham == true || run.tilemanager.tile[tilenum2].cham == true) {
							emty.cham = true;
			}
			break;
		case  "left" :
			// cập nhật ô baby muốn đến
			emtyLeftCol = (emtyLeftWorldX - emty.speed )/run.size;
						
			tilenum1 = run.tilemanager.mapTileMun[emtyLeftCol][emtyTopRow];
		    tilenum2 = run.tilemanager.mapTileMun[emtyLeftCol][emtyBotRow];
						
			if(run.tilemanager.tile[tilenum1].cham == true || run.tilemanager.tile[tilenum2].cham == true) {
							emty.cham = true;
			}
			break;
		case  "right" :
			emtyRightCol = (emtyRightWorldX + emty.speed )/run.size;
						
			tilenum1 = run.tilemanager.mapTileMun[emtyRightCol][emtyTopRow];
			tilenum2 = run.tilemanager.mapTileMun[emtyRightCol][emtyBotRow];
						
			if(run.tilemanager.tile[tilenum1].cham == true || run.tilemanager.tile[tilenum2].cham == true) {
							emty.cham = true;
			}
			break;
			
		} 
		
		
		 
	}
	
	public int checkObj(Emty emty , boolean  player) {
		int index = 999;
		
		for(int i=0; i< run.obj.length; i++) {
			if(run.obj[i] != null) {
				
				// vi tri vat the
				emty.solid.x = emty.worldX + emty.solid.x;
				emty.solid.y = emty.worldY + emty.solid.y;
				// vi tri cac doi tuong
				run.obj[i].solidArea.x = run.obj[i].worldX + run.obj[i].solidArea.x;
				run.obj[i].solidArea.y = run.obj[i].worldY + run.obj[i].solidArea.y;
				
				switch (emty.huong) {
				case  "up":
					emty.solid.y -= emty.speed;
					if(emty.solid.intersects(run.obj[i].solidArea)) {
						 if(run.obj[i].cham == true) {
							 emty.cham = true;
						 }
						 if(player == true) {
							 index = i;
						 }
					}
					break;
				case  "dow":
					emty.solid.y += emty.speed;
					if(emty.solid.intersects(run.obj[i].solidArea)) {
						 if(run.obj[i].cham == true) {
							 emty.cham = true;
						 }
						 if(player == true) {
							 index = i;
						 }
					}
					break;
				case  "left":
					emty.solid.x -= emty.speed;
					if(emty.solid.intersects(run.obj[i].solidArea)) {
						 if(run.obj[i].cham == true) {
							 emty.cham = true;
						 }
						 if(player == true) {
							 index = i;
						 }
					}
					break;
				case  "right":
					emty.solid.x += emty.speed;
					if(emty.solid.intersects(run.obj[i].solidArea)) {
						 if(run.obj[i].cham == true) {
							 emty.cham = true;
						 }
						 if(player == true) {
							 index = i;
						 }
					}
					break;
			   }
//				end switch
				
				// đặt lại x và y  
				emty.solid.x = emty.solidAreaDefaultX;
				emty.solid.y = emty.solidAreaDefaultY;
				run.obj[i].solidArea.x = run.obj[i].solidAreaDefaultX;
				run.obj[i].solidArea.y = run.obj[i].solidAreaDefaultY;
				
		}
	  }
		return index;
	}

}
