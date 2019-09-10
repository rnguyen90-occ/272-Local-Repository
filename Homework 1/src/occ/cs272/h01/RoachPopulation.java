/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * rnguyen90 <your OCC login name such as sgilbert>
 * 9/9/19 <the date>
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "rnguyen90";
    public static final String ASSIGNMENT = "H01-A";
    
    int roaches;

    public RoachPopulation(int roaches) {
    	this.roaches = roaches;
    }
    
    public void breed() {
    	roaches = roaches *.2;
    }
    
    public void spray() {
    	roaches = roaches * .9;
    	
    }
    
    public double getRoaches() {
    	return roaches;
    }
    // TODO: Complete the RoachPopulation class
    
    
    
}
