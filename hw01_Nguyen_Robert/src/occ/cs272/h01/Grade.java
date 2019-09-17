/**
 * CS 272 - Fall 2019
 * H01-Grade.java
 */
package occ.cs272.h01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @rnguyen90 <your OCC login name such as sgilbert>
 * @9/9/19 <the date>
 *
 */
public class Grade
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "rnguyen90";
    public static final String ASSIGNMENT = "H01-C";
    
    private double numericValue;
    private String grade;
    
    /**
     * Constructs a Grade object given a letter grade.
     * @param input the letter grade.
     */
    public Grade(String input) 
    {
        grade = input.toUpperCase();
    }
    
    /**
     * getNumericGrade
     * @return returns the numeric value of this grade.
     */
    public double getNumericGrade() {
    	Map<String, Double> gradeMap = new HashMap<String,Double>() {{
    		put("A+", 4.0);
    		put("A", 4.0);
    		put("A-", 3.7);
    		put("B+", 3.3);
    		put("B", 3.0);
    		put("B-", 2.7);
    		put("C+", 2.3);
    		put("C", 2.0);
    		put("C-", 1.7);
    		put("D+", 1.3);
    		put("D", 1.0);
    		put("D-", 0.7);
    		put("F", 0.0);
    		
    	}};
    	
    	if (gradeMap.containsKey(grade)) {
    		return gradeMap.get(grade);
    	}
    		return -1.0;
    		
    	}

    /**
     * Use this main method to interactively
     * test the getNumericGrade method.
     */
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter a letter grade: ");
            String input = in.nextLine();
            Grade g = new Grade(input);
            double grade = g.getNumericGrade();
            System.out.println("Numeric value: " + grade);
        }
    }
}
