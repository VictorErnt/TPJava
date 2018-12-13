import java.util.*;

public class Balle {
	private double vx,vy;
	private double x,y;
	private final double g=9.81;
	private int t=0;
	private double dt=0.3;

	 public Balle(double x, double y, double vx, double vy) {
		 this.vx=vx;
		 this.vy=vy;
		 this.x=x;
		 this.y=y;
	 }
	 
	 public void Position() {
		 t=t+1;
		 this.vy=vy+g*dt*t;
		 this.y=y-vy*dt*t;
		 this.x=x+vx*dt*t;
	 }
	 
	 public void Rebond() {
		 if(Espace.getxmin()<=x){
			 this.vy=-vy;
		 }
		 if(Espace.getymin()<=x){
			 this.vx=-vx;
		 }
		 if(Espace.getxmax()<=x){
			 this.vy=-vy;
		 }
		 if(Espace.getymax()<=x){
			 this.vx=-vx;
		 }
		
	 }
	 
	 public double getBallex() {
		 return (this.x);
	 }
	 public double getBalley() {
		 return (this.y);
	 }
	 public void Setx(double x) {
		 this.x=x;
	 }
	 public void Sety(double y) {
		 this.y=y;
	 }
	 
}
