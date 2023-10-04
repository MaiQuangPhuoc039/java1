	package vd;

import javax.swing.JFrame;

import Main.Run;

public class Main {
	
	public static vd.Run run = new vd.Run();
	public static void main(String[] args) {
    	
   	 
//        JFrame  frame = new JFrame("leo nui cuoi ky");
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       frame.setResizable(false);
//       frame.setTitle("demo2");
//       
//        run = new vd.Run();
//       frame.add(run); 
//       frame.pack();
//       
//       frame.setLocationRelativeTo(null);
//       frame.setVisible(true);
//       run.setupGame();
//       run.startGame();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("demo2");
		 
		run =  new vd.Run();
		frame.add(run);
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		run.setupGame();
		run.startGame();
       
    }
}
