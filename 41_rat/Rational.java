public class Rational {
	private int numerator;
	private int denominator;

	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	public Rational(int num, int denom) {
		if (denom == 0) {
			numerator = 0;
			denominator = 1;
			System.out.println("ERROR");
		} else {
			numerator = num;
			denominator = denom;
		}
	}
}
