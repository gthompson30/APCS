public class helloName {
	public String helloName( String name ) {
		return "Hello " + name + "!";
	}
	
	public static void main( String[] args ) {
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
	}
}
