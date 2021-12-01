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
			System.out.println("ERROR: Denominator cannot be 0");
		} else {
			numerator = num;
			denominator = denom;
		}
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public float floatValue() {
		return (float) numerator / denominator;
	}

	public void multiply(Rational r) {
		numerator *= r.numerator;
		denominator *= r.denominator;
	}

	public void divide(Rational r) {
		numerator *= r.denominator;
		denominator *= r.numerator;
	}
}
