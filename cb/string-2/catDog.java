public class catDog {
	public static int countInstances( String str, String substr ) {
		int subLen = substr.length();
		int count = 0;
		
		for (int i = 0; i < str.length() - subLen + 1; i++) {
			if (str.substring(i, i+subLen).equals(substr)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean catDog( String str ) {
		return countInstances(str, "cat") == countInstances(str, "dog");
	}
	
	public static void main( String[] args ) {
		System.out.println(catDog("catdog") + " ... should be true");
		System.out.println(catDog("catxxdogxxxdog") + " ... should be false");
	}
}
