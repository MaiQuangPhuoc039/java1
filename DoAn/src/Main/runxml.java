package Main;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class runxml {
	  public static void main(String[] args) {
			try {
				DocumentBuilderFactory dbf =  DocumentBuilderFactory.newInstance();
				DocumentBuilder db= dbf.newDocumentBuilder();
				Document doc =db.parse("C:\\javahkII\\DoAn\\src\\Main\\XML.xml");
//				Document doc = db.parse("C:\\javahkII\\DoAn\\src\\Main\\demo.xml");
				Element lophoc = doc.getDocumentElement();
				
				NodeList gioithieu = lophoc.getElementsByTagName("gioithieu");
				NodeList quyluat = lophoc.getElementsByTagName("quyluat");
				NodeList nhanvat = lophoc.getElementsByTagName("nhanvat");
				NodeList huong = lophoc.getElementsByTagName("huong");
				NodeList screenX= lophoc.getElementsByTagName("screenX");
				NodeList screenY = lophoc.getElementsByTagName("screenY");
				NodeList width  = lophoc.getElementsByTagName("width");
				NodeList heigt = lophoc.getElementsByTagName("height");
				NodeList maxCol = lophoc.getElementsByTagName("maxcol");
				NodeList maxRow = lophoc.getElementsByTagName("maxrow");
				NodeList maxWorldCol = lophoc.getElementsByTagName("maxWorldCol");
				NodeList maxWorldRow = lophoc.getElementsByTagName("maxWorldRow");
				
				NodeList name = lophoc.getElementsByTagName("name");
				NodeList cham = lophoc.getElementsByTagName("cham");
				NodeList worldX = lophoc.getElementsByTagName("worldX");
				NodeList worldY = lophoc.getElementsByTagName("worldY");
				NodeList worldX2 = lophoc.getElementsByTagName("worldX2");
				NodeList worldY2 = lophoc.getElementsByTagName("worldY2");
				NodeList worldX3 = lophoc.getElementsByTagName("worldX3");
				NodeList worldY3 = lophoc.getElementsByTagName("worldY3");
				NodeList solidArea = lophoc.getElementsByTagName("solidArea");

				
				List<Run> ds = new ArrayList<>();
				NodeList listrun = lophoc.getElementsByTagName("run");
				
				List<SuperObject> ds1 = new ArrayList<>();
				NodeList listkey = lophoc.getElementsByTagName("superObject");
				
				
				for(int i=0; i<name.getLength(); i++) {
				     Run run = new Run();
				     SuperObject object = new SuperObject();
				     ObjBom bom = new ObjBom();
				     
				     run.setGioithieu(gioithieu.item(i).getTextContent());
				     run.setQuyluat(quyluat.item(i).getTextContent());
				     run.setNhanvat(nhanvat.item(i).getTextContent());
				     run.setHuong(huong.item(i).getTextContent());
				     run.setScreenX(screenX.item(i).getTextContent());   // 360
				     run.setScreenY(screenY.item(i).getTextContent());    // 264
				     run.setMaxMapCol1(maxWorldCol.item(i).getTextContent());
				     run.setMaxMapRow1(maxWorldRow.item(i).getTextContent());
				     run.setWidth11(width.item(i).getTextContent());
				     run.setHeight11(heigt.item(i).getTextContent());
				     run.setMaxcol11(maxCol.item(i).getTextContent());
				     run.setMaxrow11(maxRow.item(i).getTextContent());
//				     
				     object.setName(name.item(i).getTextContent());
				     object.setCham1(cham.item(i).getTextContent());
				     object.setX1(worldX.item(i).getTextContent());
				     object.setY1(worldY.item(i).getTextContent());
				     object.setX2(worldX2.item(i).getTextContent());
				     object.setY2(worldY2.item(i).getTextContent());
				     object.setX3(worldX3.item(i).getTextContent());
				     object.setY3(worldY3.item(i).getTextContent());
				     object.setRec(solidArea.item(i).getTextContent());
				   
				  
				     
						ds.add(run);
						ds1.add(object);
						 
					}
					
					for(Run run : ds)
						System.out.println(run);
					
					for(SuperObject object : ds1)
						System.out.println(object);
					
					 
				 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
