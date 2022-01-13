import java.util.Scanner;

/**

// Nacho Patcho (Gabriel Thompson and Iggy, Faiza Huda, Truthful Tom and Huebert, Jacob Ng and PreGuac)
// APCS pd8
// HW56 -- Turing Training Wheels
// 2022-01-12w
// time spent: 0.4hrs

 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
