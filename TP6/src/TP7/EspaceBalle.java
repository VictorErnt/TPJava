package TP7;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;


//main display panel for game

public class EspaceBalle extends JPanel {
	
	private static final int FPS = 30;  // Frames per second (fps)
	   
	private Balle balle;         // A single bouncing Ball's instance
	private Espace space;  // The container rectangular box
	  
	private MyPanel panel; // panel for drawing the ball inside the space
	private int panelWidth;
	private int panelHeight;
	
	
	public EspaceBalle(int width, int height) {
		  
	      panelWidth = width;
	      panelHeight = height;
	      
	      // generate random pos and angle at the beginning of
	      Random rand = new Random();
	      int radius = 20;
	      int x = rand.nextInt(panelWidth); 
	      int y = rand.nextInt(panelHeight); 
	      int speed = rand.nextInt(250);
	      int angleDeg = rand.nextInt(90);
	      balle = new Balle(x, y, radius, speed, angleDeg, Color.RED);
	     
	      // Init the Container Box to fill the screen
	      space = new Espace(0, 0, panelWidth, panelHeight, Color.BLACK, Color.WHITE);
	     
	      // Init the custom drawing panel for drawing the game
	      panel = new MyPanel();
	      this.setLayout(new BorderLayout());
	      this.add(panel, BorderLayout.CENTER);
	      
	      // Handling window resize.
	      this.addComponentListener(new ComponentAdapter() {
	         @Override
	         public void componentResized(ComponentEvent e) {
	            Component c = (Component)e.getSource();
	            Dimension dimension = c.getSize();
	            panelWidth = dimension.width;
	            panelHeight = dimension.height;
	            
	            space.set(0, 0, panelWidth, panelHeight);
	         }
	      });
	  
	      // Start the simulation
	      start();
	}
	

		public void start() {
		   // create a game thread
		   Thread gameThread = new Thread() {
		      public void run() {
		         while (true) {
		            // compute the state of the ball at each state
		            update();
		            // Refresh the screen
		            repaint();
		            // Delay
		            try {
		               Thread.sleep(1000 / FPS);
		            } catch (InterruptedException ex) {}
		         }
		      }
		   };
		   gameThread.start();  // Invoke the gameThread.run()
		}
		
		public void update() {
		   balle.updatePosAndSpeed(space);
		}
		
		class MyPanel extends JPanel {
		   
		   @Override
		   public void paintComponent(Graphics g) {
		      super.paintComponent(g);    // background
		      // Draw the space and the ball
		      space.drawing(g);
		      balle.drawing(g);
		      // Display the data describing the ball in the space
		      g.setColor(Color.WHITE);
		      g.setFont(new Font("Courier New", Font.PLAIN, 14));
		      g.drawString("Balle " + balle.toString(), 30, 40);
		   }
		  
		   
		   @Override
		   public Dimension getPreferredSize() {
		      return (new Dimension(panelWidth, panelHeight));
		   }
		}
}
