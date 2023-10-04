package vd;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

public class Key implements KeyListener {
    public Run run;

    public boolean upPre, leftPre, rightPre, dowPre;
    
	public Key(Run run) {
		this.run = run;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP) {
			upPre  = true;
		}
		if(code == KeyEvent.VK_LEFT) {
			leftPre = true;
		}
		if(code == KeyEvent.VK_RIGHT) {
			rightPre  = true;
		}
		if(code == KeyEvent.VK_DOWN) {
			dowPre = true;
		}
		if(code ==KeyEvent.VK_O) {
			JOptionPane.showMessageDialog(null, "THOAT");
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP) {
			upPre  = false;
		}
		if(code == KeyEvent.VK_LEFT) {
			leftPre = false;
		}
		if(code == KeyEvent.VK_RIGHT) {
			rightPre  = false;
		}
		if(code == KeyEvent.VK_DOWN) {
			dowPre = false;
		}
		
		if(code == KeyEvent.VK_P) {
			if(run.playgame == run.play) {
				run.playgame = run.pause;
			}else if(run.playgame == run.pause) {
				run.playgame = run.play;
			}
		
		}
	}
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
}
