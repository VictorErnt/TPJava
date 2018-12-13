import java.util.*;
public class Mains {

	
	public static void trajectoire(double v0x,double v0y, double x0,double y0) {
		Espace space=new Espace(-1000,1000,-1000,1000);
		Balle balle=new Balle(x0,y0,v0x,v0y);
		double x;
		double y;
		while(true) {
			x=balle.getBallex();
			y=balle.getBalley();
			balle.Position();
			x=balle.getBallex();
			y=balle.getBalley();
			balle.Rebond();
			x=balle.getBallex();
			y=balle.getBalley();
			System.out.println(y);
			System.out.println(x);
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trajectoire(0,0,5,5);
	}

}
