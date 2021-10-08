/*
Gabriel Thompson, Nora Miller, Joshua Yagupsky
APCS
HW14 -- Customize Your Creation
2021-10-07
*/

/*
DISCO:
 - You can create default constructors by overloading constructors with other versions of the function
   that take in no arguments, in which "default" parameters are set.

QCC:
 - Is overloading exclusive to Java? Does it appear in other programming languages (e.g. Python, JS, C)?
 - Does Java have keyword arguments the same way that Python does? Can these be used in place of      
   overloaded functions, to create default parameters?

*/

public class BigSib {
	String helloMsg;
	
	public BigSib() {
		helloMsg = "Hi there,";
	}
	
	public BigSib( String greeting ) {
		helloMsg = greeting;
	}
	
	public String greet( String target ) {
		return helloMsg + " " + target;
	}
}
