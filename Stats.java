public class Stats {
	
	public static void main( String[] args ) {
		System.out.println(gcd(12, 15));
		System.out.println(gcdER(12, 15));
		System.out.println(gcdEW(12, 15));
	}
	
	public static int gcd( int a, int b ) {
		int check = 1;
		
		while ((check % a != 0) || (check % b != 0)) {
			check++;
		}
		return check;
	}
	
	public static int gcdER( int a, int b ) {
		if (a == b) {
			return a;
		}
		if (a > b) {
			a -= b;
			gcd(a, b);
		} else {
			b -= a;
			gcd(a, b);
		}
		return a;
	}
	
	public static int gcdEW( int a, int b ) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
	
}
