import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class Wordle {

	public static String[] ALLOWED = new String[10657];
	public static String[] CORRECT = new String[2315];

	public static void main(String[] args) {
		File allowed = new File("allowed.txt");
		File answers = new File("answers.txt");
		try {
			Scanner sc = new Scanner(allowed);
			int i;

			for (i = 0; i < ALLOWED.length; i++) {
				ALLOWED[i] = sc.next();
			}
			sc = new Scanner(answers);
			for (i = 0; i < CORRECT.length; i++) {
				CORRECT[i] = sc.next();
			}
		} catch(Exception e) { System.out.println(e); }

		String answer = randomWord();
		Scanner sc = new Scanner(System.in);
		int guesses = 0;
		String selection = "";

		while (guesses < 6 && !selection.equals(answer)) {
			System.out.println("What word do you choose to enter?");
			do {
				selection = sc.nextLine();
				if (!valid(selection)) { System.out.println("Not valid!"); }
				else {
					printSelection(selection, answer);
					guesses++;
				}

			} while (!valid(selection));
		}
		if (guesses >= 6) {
			System.out.println("You took 6 guesses thats too many sorry bye");
		}
		if (selection.equals(answer)) {
			System.out.println("yay you win " + answer + " was the right answer");
		}
	}

	public static boolean valid(String w) {
		for (String word : ALLOWED) {
			if (word.equals(w)) {
				return true;
			}
		}
                for (String word : CORRECT) {
                        if (word.equals(w)) {
                                return true;
                        }
                }
		return false;
	}

	public static String randomWord() {
		return CORRECT[(int) (Math.random() * CORRECT.length)];
	}

	public static void printSelection(String selection, String answer) {
                for (int i = 0; i < 5; i++) {
                	if (selection.charAt(i) == answer.charAt(i)) {
                                System.out.print("\u001b[32;1m");
                        } else if (answer.indexOf(selection.charAt(i)) != -1) {
                                System.out.print("\u001b[33;1m");
                        } else {
                        	System.out.print("\u001b[37;1m");
                        }
                        System.out.print(selection.charAt(i) + "\033[0m");
                }
                System.out.println();
	}

}
