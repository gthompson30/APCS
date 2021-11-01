public class makeAbba {
	public String makeAbba( String a, String b ) {
		return a + b + b + a;
	}
	
	public static void main( String[] args ) {
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
	}
}
