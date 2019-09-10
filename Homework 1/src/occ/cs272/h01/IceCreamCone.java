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
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "rnguyen90";
    public static final String ASSIGNMENT = "H01-B";
    
    double radius, height;
    double pi = 3.14;

    public double getSurfaceArea(double radius, double height) {
    	
    	double SurfaceArea = (pi * (radius * (radius + Math.sqrt((Math.pow(height, 2) + Math.pow(radius, 2))))));
    	return SurfaceArea;
    }
    
    public double getVolume(double radius, double height) {
    	double Volume = pi * (Math.pow(radius, 2) * height * (1/3));
    	return Volume;
    }
    // TODO: Complete this class
    
    
    
    
}
