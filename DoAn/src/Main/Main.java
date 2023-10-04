package Main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	
	  
	  
    private static Run run;

	public static void main(String[] args) {
    	
    	 
         JFrame  frame = new JFrame("leo nui cuoi ky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("demo game 2d cuoi ky java");
        
          run = new Run();	
        frame.add(run); 
        frame.pack();
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        run.setupGame();
        run.startGame();
        
        
     }
}
