public class BigSib {
	static String helloMsg;
	
	public static void setHelloMsg( String msg ) {
		helloMsg = msg;
	}
	
	public static String greet( String greetingTarget ) {
		return helloMsg + " " + greetingTarget;
	}
}
