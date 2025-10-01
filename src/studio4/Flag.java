package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.clear();
		StdDraw.setXscale(0,18);
		StdDraw.setYscale(0,12);
		StdDraw.setPenColor(147,0,76);
		StdDraw.filledRectangle(9,10,9,2);
		StdDraw.setPenColor(200,44,76);
		StdDraw.filledRectangle(9, 2, 9, 2);
		StdDraw.setPenColor(225, 200, 50);
		StdDraw.setPenRadius(0.04);
		StdDraw.arc(9,4.25,4,0,180);
		StdDraw.setPenColor(102, 51, 0);
		StdDraw.filledCircle(9,6.5,1);
		StdDraw.setPenColor(0, 0,0);
		StdDraw.filledCircle(8.85,6.9,0.15);
		StdDraw.filledCircle(9.15,7.2,0.15);
	}
}