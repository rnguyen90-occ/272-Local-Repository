/**
 * CS 272 - Fall 2019
 * H01-Sequence.java
 */


import java.util.Arrays;

/**
 * @author <your OCC login name such as sgilbert>
 * @version <the date>
 *
 */
public class Sequence
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "rnguyen90";
    public static final String ASSIGNMENT = "H01-D";
    
    private int[] array;
    
    /**
     * Constructs a sequence of integers.
     * @param array the array to initialize the sequence.
     */
    public Sequence(int[] array)
    {
        this.array = array.clone();
    }
    
    // TODO: Write the three versions of slice() here
    Sequence slice(int start) {
    	if (start < 0) {
    		start += this.array.length;
    	}
    	
		int [] b = Arrays.copyOfRange(this.array, start, this.array.length);
		Sequence test = new Sequence(b);
		return test;
    	
    }
    
    Sequence slice(int start, int end) {
    	if (end < 0) {
    		end += this.array.length;
    	}
    	if (start < 0) {
    		start += this.array.length;
    	}
    	
		int [] b = Arrays.copyOfRange(this.array, start, end);
		Sequence test = new Sequence(b);
		return test;
    }
    
    
    
    
    
    @Override
    public String toString()
    {
        String result = "{";
        if (array.length > 0)
        {
            result += array[0];
            for (int i = 1; i < array.length; i++)
            {
                result += ", " + array[i];
            }
        }
        return result + "}";
    }
    
    public static void main(String[] args)
    {
        Sequence a = new Sequence(new int[]{1, 2, 3, 4, 5});
        // some informal testing
//        System.out.println("a.slice(0)->" + a.slice(0));
//        System.out.println("a.slice(1)->" + a.slice(1));
//        System.out.println("a.slice(-1)->" + a.slice(-1));
//        System.out.println("a.slice(-2)->" + a.slice(-2));
//        System.out.println("a.slice(5)->" + a.slice(5));
//        System.out.println("a.slice(-5)->" + a.slice(-5));
//        System.out.println("a.slice(2,5)->" + a.slice(-2,-1));
//        System.out.println("a.slice(0, 5, 2)->" + a.slice(0, 5, 2));
//        System.out.println("a.slice(1, 5, 2)->" + a.slice(1, 5, 2));
//        System.out.println("a.slice(1, 5, 3)->" + a.slice(1, 5, 3));
//        System.out.println("a.slice(2, 5, 3)->" + a.slice(2, 5, 3));
//        System.out.println("a.slice(-1, -6, -1)->" + a.slice(-1, -6, -1));
    }
}
