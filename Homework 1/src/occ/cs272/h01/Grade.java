/**
 * CS 272 - Fall 2019
 * H01-Grade.java
 */
package occ.cs272.h01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * rnguyen90 <your OCC login name such as sgilbert>
 * 9/9/19 <the date>
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
        grade = input;
    }
    
    /**
     * getNumericGrade
     * @return returns the numeric value of this grade.
     */
    public double getNumericGrade(String grade) {
    	Map<Character, Double> gradeMap = new HashMap<Character,Double>() {{
    		put('A', 4.0);
    		put('B', 3.0);
    		put('C', 2.0);
    		put('D', 1.0);
    		put('F', 0.0);
    	}};
    	
    	char [] gradeParts = grade.toCharArray();
    	double numericGrade = gradeMap.get(gradeParts[0]);
    	if(gradeParts.length > 1) {
    		
    		switch(gradeParts[1]) {
    		case '+':
    			numericGrade += 0.3;
    			break;
    		case '-':
    			numericGrade -= 0.3;
    			break;
    		}
    	}
    	return numericGrade;
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
            double grade = g.getNumericGrade(input);
            System.out.println("Numeric value: " + grade);
        }
    }
}
