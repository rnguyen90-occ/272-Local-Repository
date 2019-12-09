package IC03A.question1;

public class BillfoldTester {
	
	public static void main (String [] args) {
		
		DriverLicense d = new DriverLicense("John Doe", 2007);
		CallingCard c = new CallingCard("Omega Card", "30123333", "1234");
		
		BillFold b = new BillFold();
		b.addCard(d);
		b.addCard(c);
		
		System.out.println(b.formatCards());
	}

}
