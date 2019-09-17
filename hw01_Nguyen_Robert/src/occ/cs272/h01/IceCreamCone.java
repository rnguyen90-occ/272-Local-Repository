/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

/**
 * rnguyen90 <your OCC login name such as sgilbert>
 * 9/9/19 <the date>
 * 
 */
public class IceCreamCone
{
	public IceCreamCone(double height, double radius) {
		this.radius = radius;
		this.height = height;
	}
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "rnguyen90";
    public static final String ASSIGNMENT = "H01-B";
    
    double radius, height;

    public double getSurfaceArea() {
    	
    	double SurfaceArea = ((Math.PI) * (radius) * ((radius + (Math.sqrt(((Math.pow(height, 2)) + (Math.pow(radius, 2)))))))) - (Math.PI * (Math.pow(radius, 2)));
    	return SurfaceArea;
    }
    
    public double getVolume() {
    	double Volume = (Math.PI) * ((Math.pow(radius, 2)) * height * (1.0/3.0));
    	//System.out.println(Volume);
    	return Volume;
    }


    // TODO: Complete this class
    
    
    
    
}
