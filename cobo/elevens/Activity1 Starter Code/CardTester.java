/*
Team Buckaroos (Faiza Huda, Tasnim Chowdhury, Gabriel Thompson)
APCS
L07 -- But These Go Up To Eleven
2022-03-21
time spent: 3.0hrs
*/

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("ace", "spades", 13);
		Card card2 = new Card("ace", "spades", 13);
		Card card3 = new Card("6", "diamonds", 5);

		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
		System.out.println(card1.toString());
		System.out.println(card3.toString());
	}
}
