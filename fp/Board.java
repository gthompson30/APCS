import java.util.Arrays;

public class Board {

	int width, height;
	int countMines;
	boolean[][] mines;
	boolean[][] clicked;

	public Board(int newWidth, int newHeight) {
		width = newWidth;
		height = newHeight;
	}

	public void initialize() {
		int chooseX, chooseY;

		board = new boolean[height][width];
		clicked = new boolean[height][width];
		countMines = (int) (height * width * 0.2);
		for (int i = 0; i < countMines; i++) {
			chooseX = (int) (Math.random() * width);
			chooseY = (int) (Math.random() * height);
			if (board[chooseY][chooseX] == false) {
				board[chooseY][chooseX] = true;
			}
		}
	}

	public void display() {
		for ( int y = 0; y < height; y++ ) {
			
		}
	}

	public void print2d(boolean[][] a) {
		for (boolean[] b : a) {
			System.out.println(Arrays.toString(b));
		}
	}

}
