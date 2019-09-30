
public class Recursion {
	
	public static void reverse(String a) {
		
		if (a.length() < 1) {
			System.out.print(a);
		}
		else {
			System.out.print(a.charAt(a.length() - 1));
			reverse(a.substring(0, a.length() - 1));
		}	
		
	}
	
	public static String reverse2(String a) {
		
		return a;
	}
	public static String reverse (String a, int start, int end) {
		
		return a;
	}
	
	public static String reverse3(String a) {
		String b = null;
		
		for (int i = a.length() -1; i >=0; i--) {
			b += a.charAt(i);
		}
		System.out.print(b);
		return b;
		
	}
	public static void main (String [] args) {
		System.out.println("Reverse 1:");
		reverse("Hello!\n");
		reverse("Orange Coast College\n");
		reverse("go\n");
		reverse("x\n");
		
		System.out.println("\nReverse 3:");
		reverse3("Hello!\n");
		reverse3("Orange Coast College\n");
		reverse3("go\n");
		reverse3("x\n");
	}

}
