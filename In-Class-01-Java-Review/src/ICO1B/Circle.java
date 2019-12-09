package ICO1B;

public class Circle {
	
	int radius;
	double area;
	
	public static void main(String [] args) {
		}
	
	
	public Circle (int a) {
		radius  = a;
		double pi = 3.14;
		area = pi * (Math.pow(radius, 2));
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public String toString() {
		String a = "Radius: " + this.radius;
		String b = "\nArea: " + this.area;
		String c = a + b;
		return c;
	}
	
//	double pi = 3.14;
//	double area = pi * (Math.pow(radius, 2));
}
