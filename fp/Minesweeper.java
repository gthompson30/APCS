import java.util.Scanner;

public class Minesweeper {

	static int width, height;
	static Board b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! Welcome to Minesweeper");
		System.out.print("How wide would you like your board? ");
		width = sc.nextInt();
		System.out.print("How tall would you like your board? ");
		height = sc.nextInt();

		b = new Board(width, height);
		b.initialize();
		b.display();
	}

}
