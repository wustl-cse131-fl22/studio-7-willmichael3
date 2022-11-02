package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public boolean isSquare() {
		return length==width;
	}
	public double area() {
		return length*width;
	}
	public double perimeter() {
		return (2*length)+(2*width);
	}
	public boolean isSmaller(Rectangle two) {
		return area() < two.area();
	}
	public void drawRect() {
		StdDraw.rectangle(.5,.5,length,width);
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(.2,.2);
		Rectangle rect2 = new Rectangle(6,7);
		System.out.println(rect1.isSmaller(rect2));
		rect1.drawRect();
	}
}