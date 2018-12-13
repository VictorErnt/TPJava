package TP7;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		// open the window
	    javax.swing.SwingUtilities.invokeLater(new Runnable() {
	       public void run() {
	          JFrame frame = new JFrame("Simulation d'une balle");
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.setContentPane(new EspaceBalle(800, 800)); // JPanel of size 800 by 800
	          frame.pack();            
	          frame.setVisible(true);  // print window
	       }
	    });
	}
}
