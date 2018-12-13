
public class Espace {
	private static int xmin;
	private static int xmax;
	private static int ymin;
	private static int ymax;
	
	public Espace(int xmins,int xmaxs,int ymins,int ymaxs) {
		xmin=xmins;
		xmax=xmaxs;
		ymin=ymins;
		ymax=ymaxs;
	}
	
	
	 public static int getxmin() {
		 return (xmin);
	 }
	 public static int getxmax() {
		 return (xmax);
	 }
	 public static int getymax() {
		 return (ymax);
	 }

	 public static int getymin() {
		 return (ymin);
	 }
}
