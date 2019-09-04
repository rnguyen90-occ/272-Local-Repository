package IC01A;
import java.util.Random;
import java.util.Arrays;

public class ArrayProblem {
	public static void main (String [] args) {
	int [] a = new int [100];
	
	Random b = new Random();
		
		int High = 75;
		int Low = 25;
		
	for (int i = 0; i < 100; i++) {

		a[i] = b.nextInt(High - Low) + Low;
	
		if(i%20 == 0) {
			System.out.println(" ");
		}
		System.out.print(a[i] + " ");
	}
	
	}
}
