package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class Tilemanager {
    
	public Run run;
	public static Emty emty;
	public Tile [] tile;
//	public int tileNum;
	
	// tao mang hai chiu de ve map
	 public int mapTileMun [][];
	
	
	public Tilemanager(Run run) {
		this.run = run;
		tile = new Tile[100];
		
		// truyen vao mang hai chieu la : maxcolmap va maxrowmap  ( max hang va max cot cua map)
		mapTileMun = new int [run.maxWorldCol][run.maxWorldRow];
		getTileimg() ;
		
		// loadmap doc du lieu tu file de ve map (iostream)
		loadMap("world.txt");   
	} 
	
	
	
	// gan cac img cho cac thanh phan 
	public void getTileimg() {
		try {
			
			tile[0]  = new Tile();
			tile[0].img = ImageIO.read(getClass().getResourceAsStream("grass00.png"));
			
			tile[24]  = new Tile();
			tile[24].img = ImageIO.read(getClass().getResourceAsStream("grass01.png"));
			
			tile[1]  = new Tile();
			tile[1].img = ImageIO.read(getClass().getResourceAsStream("wall.png"));
			tile[1].cham = true;
			
			tile[2]  = new Tile();
			tile[2].img = ImageIO.read(getClass().getResourceAsStream("water00.png"));
			tile[2].cham = true;
			
			tile[6]  = new Tile();
			tile[6].img = ImageIO.read(getClass().getResourceAsStream("water08.png"));
			tile[6].cham = true;

			tile[7]  = new Tile();
			tile[7].img = ImageIO.read(getClass().getResourceAsStream("water09.png"));
			tile[7].cham = true;
			
			tile[8]  = new Tile();
			tile[8].img = ImageIO.read(getClass().getResourceAsStream("water02.png"));
			tile[8].cham = true;
			
			tile[9]  = new Tile();
			tile[9].img = ImageIO.read(getClass().getResourceAsStream("water03.png"));
			tile[9].cham = true;

			tile[10]  = new Tile();
			tile[10].img = ImageIO.read(getClass().getResourceAsStream("water04.png"));
			tile[10].cham = true;
			
			tile[11]  = new Tile();
			tile[11].img = ImageIO.read(getClass().getResourceAsStream("water05.png"));
			tile[11].cham = true;
			
			tile[12]  = new Tile();
			tile[12].img = ImageIO.read(getClass().getResourceAsStream("water06.png"));
			tile[12].cham = true;
			
			tile[13]  = new Tile();
			tile[13].img = ImageIO.read(getClass().getResourceAsStream("water01.png"));
			tile[13].cham = true;
			
			tile[14]  = new Tile();
			tile[14].img = ImageIO.read(getClass().getResourceAsStream("water07.png"));
			tile[14].cham = true;
			
			
			
			tile[3]  = new Tile();
			tile[3].img = ImageIO.read(getClass().getResourceAsStream("earth.png"));
			
			tile[4]  = new Tile();
			tile[4].img = ImageIO.read(getClass().getResourceAsStream("cay2.png"));      // tree
			tile[4].cham = true;
				
			tile[5]  = new Tile();
			tile[5].img = ImageIO.read(getClass().getResourceAsStream("goc.png"));
			tile[5].cham = true;
			
			tile[15]  = new Tile();
			tile[15].img = ImageIO.read(getClass().getResourceAsStream("road09.png"));
			
			tile[16]  = new Tile();
			tile[16].img = ImageIO.read(getClass().getResourceAsStream("road07.png"));

			tile[17]  = new Tile();
			tile[17].img = ImageIO.read(getClass().getResourceAsStream("road10.png"));
			
			tile[18]  = new Tile();
			tile[18].img = ImageIO.read(getClass().getResourceAsStream("road05.png"));
			
			tile[19]  = new Tile();
			tile[19].img = ImageIO.read(getClass().getResourceAsStream("road04.png"));
			
			tile[20]  = new Tile();
			tile[20].img = ImageIO.read(getClass().getResourceAsStream("road11.png"));
			
			tile[21]  = new Tile();
			tile[21].img = ImageIO.read(getClass().getResourceAsStream("road12.png"));
			
			tile[22]  = new Tile();
			tile[22].img = ImageIO.read(getClass().getResourceAsStream("road02.png"));
			
			tile[23]  = new Tile();
			tile[23].img = ImageIO.read(getClass().getResourceAsStream("road00.png"));
			
			tile[25]  = new Tile();
			tile[25].img = ImageIO.read(getClass().getResourceAsStream("road01.png"));
			
			tile[26]  = new Tile();
			tile[26].img = ImageIO.read(getClass().getResourceAsStream("road03.png"));
			
			tile[27]  = new Tile();
			tile[27].img = ImageIO.read(getClass().getResourceAsStream("road08.png"));
			
			tile[28]  = new Tile();
			tile[28].img = ImageIO.read(getClass().getResourceAsStream("road06.png"));
			
			tile[29]  = new Tile();
			tile[29].img = ImageIO.read(getClass().getResourceAsStream("water10.png"));
			
			tile[30]  = new Tile();
			tile[30].img = ImageIO.read(getClass().getResourceAsStream("water11.png"));
			
			tile[31]  = new Tile();
			tile[31].img = ImageIO.read(getClass().getResourceAsStream("water12.png"));
			
			tile[32]  = new Tile();
			tile[32].img = ImageIO.read(getClass().getResourceAsStream("water13.png"));
			
			tile[33]  = new Tile();
			tile[33].img = ImageIO.read(getClass().getResourceAsStream("hut.png"));
			
			
			tile[34]  = new Tile();
			tile[34].img = ImageIO.read(getClass().getResourceAsStream("cayden.png"));
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	// doc du lieu ve  map (iostream)
	public void loadMap(String maps) {
		
//		iostream
		 try {
			
			 // du lieu dau vao 
			 InputStream is = getClass().getResourceAsStream(maps);   // lay file lien ket
				BufferedReader br = new BufferedReader(new InputStreamReader(is));  //trinh doc
				
				
				// khai bao hang va cot (duyet tu trai sang phai  neu col == maxcol thi xuong hang va duyet den het )
				int col =0;
				int row  =0;
				
				// dieu kien lap  < maxColMap va Row
				while(col < run.maxWorldCol && row <run.maxWorldRow) {
					 
					String line = br.readLine();   //  chuoi doc 1 dong  (doc dang chuoi )
					while( col < run.maxWorldCol) {
						String number []   = line.split(" ");   //  doc cac so tren 1 dong  cach nhau " "
						
						int num  = Integer.parseInt(number[col]);   // chuyen srting ve int cua  dong do  (ep chuoi thanh so nguyen)
						
						
//							dung mang hai chieu de duyet het ma tran 
						mapTileMun[col][row] = num;   
						col ++;    // col  = col +1
					}
					
					// neu cot duyet den vi tri cuoi dung cua gong thi stop  và trả về 0 , row tăng lên -> duyệt dòng mới 
					if(col == run.maxWorldCol ) {    
						                       
						 col =0;
						 row ++;
					}

				}
				
				// đóng 
				br.close();
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	// ve cac thanh phan 
	public void draw(Graphics2D g2) {
 		
		// cot va hang của map
		int worldCol =0;
		int worldRow  =0;
		
		// lap theo man hinh choi (camera)
		while(worldCol < run.maxWorldCol && worldRow <run.maxWorldRow) {
			
		 int 	  tileNum = mapTileMun[worldCol][worldRow] ; //  gan gia tri do cho mang hai chieu de duyet toan bo backgroung
			
			
			// tìm vị trí  nhân vật khi vòng lặp thay đổi các giá trị  ( diện tích )
			// ô thứ ? * size
			int worldX = worldCol * run.size;  
			int worldY = worldRow * run.size;  
			
			
			// vi tri  x và y của nhân vật 
			int screenX = worldX - run.player.worldX + run.player.screenX;
			int screenY = worldY - run.player.worldY +  run.player.screenY;
			
			
//			 tao do muot cho game (khong quan trong ) 
			if(worldX + run.size > run.player.worldX - run.player.screenX && 
			   worldX - run.size < run.player.worldX + run.player.screenX && 
			   worldY + run.size > run.player.worldY - run.player.screenY && 
			   worldY - run.size < run.player.worldY + run.player.screenY ) {
				g2.drawImage(tile[tileNum].img,screenX , screenY , run.size, run.size , null );
			}
					
			
//			g2.drawImage(tile[tileNum].img,screenX , screenY , run.size, run.size , null );
			
			
//			khi col va row thay doi thi tile se draw theo gia tri mang 2 chiu
			
			worldCol++;
			
			if(worldCol == run.maxWorldCol ) {
				worldCol =0;
				worldRow ++;
			}

		}
	}
	
	
}
