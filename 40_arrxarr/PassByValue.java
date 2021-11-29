public class PassByValue {
	public static void main(String[] args) {
		int n = 5;
		triplePBV(n);

		if (n == 15)
			System.out.println("Java is \"Pass by Reference\"");
		else
			System.out.println("Java is \"Pass by Value\"");
	}

	public static void triplePBV(int a) {
		a = a * 3;
	}
}
