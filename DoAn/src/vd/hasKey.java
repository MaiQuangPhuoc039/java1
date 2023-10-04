package vd;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

import javax.swing.JPanel;

public class hasKey extends JPanel {
    public Run run;
	Font font = new Font("Arial" , Font.BOLD, 40);
	Font font1 = new Font("Arial" , Font.BOLD, 20);
	BufferedImage imgkey;
	public boolean boolkey = false, end= false , booldoor= false, boolchest= false , booldoor1= false;
	public int countkey =0 , countdoor  , countdoor1, countchest=0;
	public double time =0;
	DecimalFormat decimal = new DecimalFormat("#0.00");
	
	public hasKey(Run run ) {
		this.run = run;
		
		ObjKey key = new ObjKey();
		imgkey = key.img;
	}
	
	
    
    public void draw(Graphics2D  g2) {
    
    	g2.setFont(font);
    	g2.setColor(Color.blue);
    	
    	g2.drawImage(imgkey, 30, 30, run.size, run.size, null);
    	g2.drawString("x "+run.player.hasKey, 90, 70);
    	
    	if(booldoor == true) {
    		countdoor ++ ;
    		if(countdoor > 80) {
    			booldoor = false;
    		}
    		g2.setFont(font1);
    		g2.drawString("you opend the door ", 50, 200);
    		
    	}
    	
    	if(end == true) {
    		g2.setFont(font1);
    		g2.drawString("complete times :"+decimal.format(time), 320, 140);
    		time += (double)1/60;
    		
    		
    		run.thread0 = null;
    	}else {
    		time +=(double)1/60;
    		g2.setFont(font1);
      	    g2.drawString(" Time : "+ decimal.format(time), run.size*11 + 90 , 45);
    	}
    	
    	if(booldoor1 == true) {
    		countdoor1 ++ ;
    		if(countdoor1 > 80) {
    			booldoor1 = false;
    		}
    		g2.setFont(font1);
    		g2.drawString("you need a key ", 50, 200);
    		
    	}
    	
    	if(boolkey == true) {
    		countkey++;
    		if(countkey > 90) {
    			boolkey = false;
    		}
    		g2.setFont(font1);
    		g2.drawString("you has a key ", 50, 200);
    	}
    	
    	
    	if(boolchest == true) {
    		
    		g2.setFont(font);
    		g2.drawString("you win", 300, 100);
    	}
    	
    	
    	if(run.playgame == run.play) {
    		
    	}else if(run.playgame == run.pause) {
    		g2.setFont(font);
    		g2.drawString("PAUSE ", 300, 250);
    	}
    	
    }
    
     
}
