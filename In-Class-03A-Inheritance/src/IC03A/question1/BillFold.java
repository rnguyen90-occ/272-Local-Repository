package IC03A.question1;

public class BillFold {
	/*
	 *  Devise another class, Billfold, which contains two cards, card1 and card2, a method
	 *  void addCard(Card) and a method String formatCards().
	 */
	private Card card1;
	private Card card2;
	
	
	public BillFold() {
		super();
	}
	public BillFold(Card card1, Card card2) {
		
		this.card1 = card1;
		this.card2 = card2;
		
	}
	
	public void addCard(Card c) {
		if (card1 == null) {
			card1 = c;
		}
		else if (card2 == null) {
			card2 = c;
		}
		
	}
	
	public String formatCards() {
		return "BillFold \n[" + card1.format() + "]\n[" + card2.format() + "]";
	}
}
