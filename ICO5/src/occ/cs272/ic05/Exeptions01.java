package occ.cs272.ic05;

import java.util.Scanner;

/** CS 272 - Exceptions example 1
*
*  Put the array code in a try block and
*  catches the array index out of bounds exception
*  if it occurs.
*
*/

public class Exeptions01
{
    public static void main(String [] args)
    {
        try (Scanner cin = new Scanner(System.in))
        {
//            System.out.println("int[] a = {5, 6, 7};");
//            System.out.print("What element do you want? ");
                   
            int [] ar = {5, 6, 7};
            boolean ok = false;
            
            while (!ok) {
                System.out.println("int[] a = {5, 6, 7};");
                System.out.print("What element do you want? ");
            
            
            	try {
            		
            	ok = true;
				String indexStr = cin.next();
				int index = Integer.parseInt(indexStr);
//				int index = System.in.read(); // IOException is an example of a checked exception - I must handle it
											    // * Note: Anything related to Runtime Exception is an Unchecked Exception, everything else is Checked Exception
				int value = ar[index];
				System.out.printf("ar[%d] = %d%n", index, value);
            }
		/*
            } catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.err.println("Please use integer input.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Please use index between 0 and " + (ar.length - 1));
			}
           
        */
            catch (Exception e) {
            	if (e instanceof NumberFormatException) {
            		System.err.println("Please use integer input.");
            		ok = false;
            	}
            	else if (e instanceof ArrayIndexOutOfBoundsException) {
            		System.err.println("Please use index between 0 and " + (ar.length-1));
            		System.err.println(e.getMessage());
            		ok = false;
            	}
            	else {
            		System.err.println("Aha I gotcha");
            		System.err.println(e.getMessage());
            		e.printStackTrace();
            		ok = false;
            	}
            } 
        }
    }
}
}

