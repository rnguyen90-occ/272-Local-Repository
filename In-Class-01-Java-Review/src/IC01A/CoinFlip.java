package IC01A;
import java.util.Scanner;

public class CoinFlip {
	public static void main (String [] args) {
		
		System.out.println("How many times will you flip the coin? ");
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		
		int x = 0;
			while (x < n) {
				if (Math.round(Math.random()) == 1) {
					System.out.println("Heads");
					x++;
			}
			
			else {
				System.out.println("Tails");
				x++;
			}
		}
	}

}
