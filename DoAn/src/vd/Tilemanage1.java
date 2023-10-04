package vd;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import Main.Tile;

public class Tilemanage1 {
	
	public Run run ;
	public Tile1 [] tile;
	public int mapTileNum [][];
	
	public Tilemanage1(Run run) {
		this.run = run;
		
		tile = new Tile1[100];
		mapTileNum = new int [run.maxworldCol][run.maxworldRow];
		
		getTileimg();
		loadMap("world.txt");
	}
	
	public void getTileimg() {
		try {
			
			tile[0]  = new Tile1();
			tile[0].img = ImageIO.read(getClass().getResourceAsStream("grass00.png"));
			
			tile[24]  = new Tile1();
			tile[24].img = ImageIO.read(getClass().getResourceAsStream("grass01.png"));
			
			tile[1]  = new Tile1();
			tile[1].img = ImageIO.read(getClass().getResourceAsStream("wall.png"));
			tile[1].cham = true;
			
			tile[2]  = new Tile1();
			tile[2].img = ImageIO.read(getClass().getResourceAsStream("water00.png"));
			tile[2].cham = true;
			
			tile[6]  = new Tile1();
			tile[6].img = ImageIO.read(getClass().getResourceAsStream("water08.png"));
			tile[6].cham = true;

			tile[7]  = new Tile1();
			tile[7].img = ImageIO.read(getClass().getResourceAsStream("water09.png"));
			tile[7].cham = true;
			
			tile[8]  = new Tile1();
			tile[8].img = ImageIO.read(getClass().getResourceAsStream("water02.png"));
			tile[8].cham = true;
			
			tile[9]  = new Tile1();
			tile[9].img = ImageIO.read(getClass().getResourceAsStream("water03.png"));
			tile[9].cham = true;

			tile[10]  = new Tile1();
			tile[10].img = ImageIO.read(getClass().getResourceAsStream("water04.png"));
//			tile[10].cham = true;
			
			tile[11]  = new Tile1();
			tile[11].img = ImageIO.read(getClass().getResourceAsStream("water05.png"));
//			tile[11].cham = true;
			
			tile[12]  = new Tile1();
			tile[12].img = ImageIO.read(getClass().getResourceAsStream("water06.png"));
//			tile[12].cham = true;
			
			tile[13]  = new Tile1();
			tile[13].img = ImageIO.read(getClass().getResourceAsStream("water01.png"));
//			tile[13].cham = true;
			
			tile[14]  = new Tile1();
			tile[14].img = ImageIO.read(getClass().getResourceAsStream("water07.png"));
//			tile[14].cham = true;
			
			
			
			tile[3]  = new Tile1();
			tile[3].img = ImageIO.read(getClass().getResourceAsStream("earth.png"));
			
			tile[4]  = new Tile1();
			tile[4].img = ImageIO.read(getClass().getResourceAsStream("cay2.png"));      // tree
			tile[4].cham = true;
				
			tile[5]  = new Tile1();
			tile[5].img = ImageIO.read(getClass().getResourceAsStream("goc.png"));
			tile[5].cham = true;
			
			tile[15]  = new Tile1();
			tile[15].img = ImageIO.read(getClass().getResourceAsStream("road09.png"));
			
			tile[16]  = new Tile1();
			tile[16].img = ImageIO.read(getClass().getResourceAsStream("road07.png"));

			tile[17]  = new Tile1();
			tile[17].img = ImageIO.read(getClass().getResourceAsStream("road10.png"));
			
			tile[18]  = new Tile1();
			tile[18].img = ImageIO.read(getClass().getResourceAsStream("road05.png"));
			
			tile[19]  = new Tile1();
			tile[19].img = ImageIO.read(getClass().getResourceAsStream("road04.png"));
			
			tile[20]  = new Tile1();
			tile[20].img = ImageIO.read(getClass().getResourceAsStream("road11.png"));
			
			tile[21]  = new Tile1();
			tile[21].img = ImageIO.read(getClass().getResourceAsStream("road12.png"));
			
			tile[22]  = new Tile1();
			tile[22].img = ImageIO.read(getClass().getResourceAsStream("road02.png"));
			
			tile[23]  = new Tile1();
			tile[23].img = ImageIO.read(getClass().getResourceAsStream("road00.png"));
			
			tile[25]  = new Tile1();
			tile[25].img = ImageIO.read(getClass().getResourceAsStream("road01.png"));
			
			tile[26]  = new Tile1();
			tile[26].img = ImageIO.read(getClass().getResourceAsStream("road03.png"));
			
			tile[27]  = new Tile1();
			tile[27].img = ImageIO.read(getClass().getResourceAsStream("road08.png"));
			
			tile[28]  = new Tile1();
			tile[28].img = ImageIO.read(getClass().getResourceAsStream("road06.png"));
			
			tile[29]  = new Tile1();
			tile[29].img = ImageIO.read(getClass().getResourceAsStream("water10.png"));
			
			tile[30]  = new Tile1();
			tile[30].img = ImageIO.read(getClass().getResourceAsStream("water11.png"));
			
			tile[31]  = new Tile1();
			tile[31].img = ImageIO.read(getClass().getResourceAsStream("water12.png"));
			
			tile[32]  = new Tile1();
			tile[32].img = ImageIO.read(getClass().getResourceAsStream("water13.png"));
			
			tile[33]  = new Tile1();
			tile[33].img = ImageIO.read(getClass().getResourceAsStream("hut.png"));
			
			
			tile[34]  = new Tile1();
			tile[34].img = ImageIO.read(getClass().getResourceAsStream("cayden.png"));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void loadMap(String maps) {
		try {
		 
			InputStream input = getClass().getResourceAsStream(maps);
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			
			int col = 0; 
			int row = 0;
			while(col < run.maxworldCol && row < run.maxworldRow) {
				String line = br.readLine();
				
				while(col < run.maxworldCol) {
					String munber []= line.split(" ");
					
					int num = Integer.parseInt(munber[col]);
					
					mapTileNum[col][row] = num;
					col++;
				}
				
				if(col == run.maxworldCol) {
					col = 0 ;
					row ++;
				}
			}
			
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
public void draw(Graphics2D g2) {
 		
		// cot va hang của map
		int worldCol =0;
		int worldRow  =0;
		
		// lap theo man hinh choi (camera)
		while(worldCol < run.maxworldCol && worldRow <run.maxworldRow) {
			
		 int 	  tileNum = mapTileNum[worldCol][worldRow] ; //  gan gia tri do cho mang hai chieu de duyet toan bo backgroung
			
			
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
//					
			
//			g2.drawImage(tile[tileNum].img,screenX , screenY , run.size, run.size , null );
			
			
//			khi col va row thay doi thi tile se draw theo gia tri mang 2 chiu
			
			worldCol++;
			
			if(worldCol == run.maxworldCol ) {
				worldCol =0;
				worldRow ++;
			}

		}
	}
}
