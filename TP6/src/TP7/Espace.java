package TP7;

import java.awt.*;


public class Espace {
	int minX, maxX, minY, maxY;  // limit of the space
	private Color background;   // background
	private Color border;   // border of xindow
	private static final Color DEFAULT_COL_BACK = Color.BLACK;
	private static final Color DEFAULT_COL_BORD = Color.YELLOW;
		
	
	public Espace(int x, int y, int width, int height, Color colorFilled, Color colorBorder) {
		minX = x;
	    minY = y;
	    maxX = x + width - 1;
	    maxY = y + height - 1;
	    this.background = colorFilled;
	    this.border = colorBorder;
	}
	
	
	public Espace(int x, int y, int width, int height) {
		this(x, y, width, height, DEFAULT_COL_BACK, DEFAULT_COL_BORD);
	}
	
	 
	public void set(int x, int y, int width, int height) {
		minX = x;
	    minY = y;
	    maxX = x + width - 1;
	    maxY = y + height - 1;
	}
	 

	 public void drawing(Graphics g) {
		 g.setColor(background);
	     g.fillRect(minX, minY, maxX - minX - 1, maxY - minY - 1);
	     g.setColor(border);
	     g.drawRect(minX, minY, maxX - minX - 1, maxY - minY - 1);
	 }
}
