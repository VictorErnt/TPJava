package TP7;

import java.awt.*;
import java.util.*;


public class Balle {
	float x, y;           // Ball's center x and y 
	float vX, vY; // Ball's speed per coordinates
	float r;         // Ball's radius 
	private Color c;  // Ball's color
	private static final Color DEFAULT_COL = Color.RED;
	private static final double G = 9.81;
	  
	   

	public Balle(float a, float b, float radius, float v, float angleDegree,
	      Color color) {
	      	x = a;
	      	y = b;
	      	// Convert (speed, angle) to (x, y), with y-axis inverted
	      	this.vX = (float)(v * Math.cos(Math.toRadians(angleDegree)));
	      	this.vY = (float)(-v * (float)Math.sin(Math.toRadians(angleDegree)));
	      	r = radius;
	      	this.c = color;
	}
	/** Constructor with the default color */
	public Balle(float x, float y, float radius, float v, float angleDegree) {
	   this(x, y, radius, v, angleDegree, DEFAULT_COL);
	}
	   
	/** Draw itself using the given graphics context. */
	public void drawing(Graphics graphic) {
	   graphic.setColor(c);
	   graphic.fillOval((int)(x - r), (int)(y - r), (int)(2 * r), (int)(2 * r));
	}
	
	public void updatePosAndSpeed(Espace space) {
	   // Get the ball's bounds, offset by the radius of the ball
	   float balleMinX = space.minX + r;
	   float balleMinY = space.minY + r;
	   float balleMaxX = space.maxX - r;
	   float balleMaxY = space.maxY - r;
	   double dt = 0.3;
	   //double coeffAttenuationRebonb = 1.0;
	   double frottementAirVisqueux = 0.9; //oversimplified way to model friction with air...
	   
	   // calculate the ball's new velocity (speedX doesn't change since gravity is vertical)
	   vY += G*dt*frottementAirVisqueux;
	   vX *= frottementAirVisqueux+0.09;
	   // Calculate the ball's new position
	   x += vX*dt;
	   y += vY*dt + 0.5*G*dt;
	   // Check if the ball moves over the bounds. If so, adjust the position and speed.
	   if (x < balleMinX) {
	      vX = -vX; // Reflect along normal
	      x = balleMinX;     // Re-position the ball at the edge
	   } else if (x > balleMaxX) {
	      vX = -vX;
	      x = balleMaxX;
	   }
	   // May cross both x and y bounds
	   if (y < balleMinY) {
	      vY = -vY;
	      y = balleMinY;
	   } else if (y > balleMaxY) {
	      vY = -vY;
	      y = balleMaxY;
	   }
	}
	
	public float getVelocity() {
	   return (float)Math.sqrt(vX * vX + vY * vY);
	}
	   

	public float getVelocityAngle() {
	   return (float)Math.toDegrees(Math.atan2(-vY, vX));
	}
	
	  
	/** Describe information on the ball. */
	public String toString() {
	    sb.delete(0, sb.length());
	    formatter.format("Coordonnees = (%3.0f,%3.0f) Rayon=%3.0f (Vx,Vy)=(%2.0f,%2.0f) " +
	          "Vitesse=%4.1f Direction du mouvement (en degres)=%4.0f", 
	          x, y, r, vX, vY, getVelocity(), getVelocityAngle());  
	    return sb.toString();
	 }
	 // Re-use to build the formatted string for toString()
	 private StringBuilder sb = new StringBuilder();
	 private Formatter formatter = new Formatter(sb);
	


}
