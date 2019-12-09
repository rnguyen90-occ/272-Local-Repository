package IC03A.question1;

public class CallingCard extends Card {
	private String cardNumber;
	private String pin;
	
	public CallingCard (String n, String cardNumber, String pin) {
		
		super(n);
		this.cardNumber = cardNumber;
		this.pin = pin;
		
	}
	
	public String format() {
		return super.format() + " " + ("Card number: " + cardNumber + "\nPin number: " + pin);
	}

	
}
