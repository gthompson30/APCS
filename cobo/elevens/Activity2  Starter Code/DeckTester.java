/*
Team Buckaroos (Faiza Huda, Tasnim Chowdhury, Gabriel Thompson)
APCS
L07 -- But These Go Up To Eleven
2022-03-21
time spent: 3.0hrs
*/

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println(d);
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		System.out.println(d.deal());
	}
}
