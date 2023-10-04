package vd;

public class CheckCham {
        public Run run ;
        public Emty emty ;
        public CheckCham(Run run ) {
        	this.run = run;
        }
        
        // kiểm tra va chạm baby với object
        public int checkObj(Emty emty , boolean player) {
        	int index = 999;
        	
        	// duyệt từ đầu đến cuối chiều dài của object
        	for(int i=0 ;i< run.obj.length; i++) {
                  // chỉ kiểm tra nếu obj chưa null
        		if(run.obj[i] != null) {
        			
        			// xác định solidArea
        			emty.solid.x = emty.worldX + emty.solid.x;
        			emty.solid.y = emty.worldY + emty.solid.y;
        			
        			run.obj[i].solidArea.x = run.obj[i].worldX ;
        			run.obj[i].solidArea.y = run.obj[i].worldY ;
        			
        			switch (emty.huong) {
					case "up": 
						emty.solid.y -= emty.speed;    // nếu huong = up thì solid giảm di y mà baby đã giảm
						if(emty.solid.intersects(run.obj[i].solidArea)) {
							System.out.println("up");
							if(run.obj[i].cham == true) {
								emty.cham = true;
							}
							if(player == true) {
								index = i;
							}
						}
						break;
					case "dow": 
						emty.solid.y += emty.speed;
						if(emty.solid.intersects(run.obj[i].solidArea)) {
							System.out.println("dơwn");
							if(run.obj[i].cham == true) {
								emty.cham = true;
							}
							if(player == true) {
								index = i;
							}
						}
						break;
					case "left": 
						emty.solid.x -= emty.speed;
						if(emty.solid.intersects(run.obj[i].solidArea)) {
							System.out.println("left");
							if(run.obj[i].cham == true) {
								emty.cham = true;
							}
							if(player == true) {
								index = i;
							}
						}
						break;
					case "right": 
						emty.solid.x += emty.speed;
						if(emty.solid.intersects(run.obj[i].solidArea)) {
							System.out.println("right");
							if(run.obj[i].cham == true) {
								emty.cham = true;
							}
							if(player == true) {
								index = i;
							}
						}
						break;
					}
//        			end switch case 
        			
        			// dat lai x v y  ()
        			emty.solid.x = emty.solidAreaDefaultX;
        			emty.solid.y = emty.solidAreaDefaultY;
        			run.obj[i].solidArea.x = run.obj[i].solidAreaDefaultX;
        			run.obj[i].solidArea.y = run.obj[i].solidAreaDefaultY;
        			
        		}
        	}
			return index;
        	
        }
        
        public void check(Emty emty) {
        	
        	// solid baby  ( rectange )
        	int emtyLeftWorldX = emty.worldX + emty.solid.x;
        	int emtyRightWorldX = emty.worldX + emty.solid.x + emty.solid.width;
        	int emtyTopWorldY = emty.worldY + emty.solid.y;
        	int emtyBotWorldY = emty.worldY + emty.solid.y + emty.solid.height;
        	
        	
        	// tim ra vi tri
        	
        	int emtyLeftCol = emtyLeftWorldX/ run.size;
    		int emtyRightCol = emtyRightWorldX/ run.size;
    		int emtyTopRow = emtyTopWorldY / run.size;
    		int emtyBotRow = emtyBotWorldY/ run.size;
    		
        	
        
        	int num1 , num2;
        	
        	switch (emty.huong) {
			case "up":
	        	  emtyTopRow  = (emtyTopWorldY - emty.speed)/run.size;
	        	
				num1 = run.tilema.mapTileNum[emtyLeftCol][emtyTopRow];
				num2 = run.tilema.mapTileNum[emtyRightCol][emtyTopRow];
				
				if(run.tilema.tile[num1].cham == true || run.tilema.tile[num2].cham == true) {
					emty.cham= true;
				}
				break;
			case "left":
				  emtyLeftCol = (emtyLeftWorldX - emty.speed)/run.size;
	        	
				num1 = run.tilema.mapTileNum[emtyLeftCol][emtyTopRow];
				num2 = run.tilema.mapTileNum[emtyLeftCol][emtyBotRow];
				
				if(run.tilema.tile[num1].cham == true || run.tilema.tile[num2].cham == true) {
					emty.cham= true;
				}
				break;
			case "right":
	        	  emtyRightCol = (emtyRightWorldX + emty.speed)/run.size;
	        	
				num1 = run.tilema.mapTileNum[emtyRightCol][emtyTopRow];
				num2 = run.tilema.mapTileNum[emtyRightCol][emtyBotRow];
				
				if(run.tilema.tile[num1].cham == true || run.tilema.tile[num2].cham == true) {
					emty.cham= true;
				}
				break;
			case "dow":
	        	  emtyBotRow  = (emtyBotWorldY + emty.speed)/run.size;
	        	
				num1 = run.tilema.mapTileNum[emtyLeftCol][emtyBotRow];
				num2 = run.tilema.mapTileNum[emtyRightCol][emtyBotRow];
				
				if(run.tilema.tile[num1].cham == true || run.tilema.tile[num2].cham == true) {
					emty.cham= true;
				}
				break;
			}
        	
        }
}
