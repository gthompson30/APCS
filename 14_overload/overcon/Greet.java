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

public class Greet {
	
	public static void main( String[] args ) {
		String greeting;
		BigSib richard = new BigSib();
		BigSib grizz   = new BigSib();
		BigSib dotCom  = new BigSib();
		BigSib tracy   = new BigSib();
		
		greeting = richard.greet("freshman");
		System.out.println(greeting);
		greeting = grizz.greet("Dr. Spaceman");
                System.out.println(greeting);
		greeting = dotCom.greet("Kong Fooey");
                System.out.println(greeting);
		greeting = tracy.greet("mom");
                System.out.println(greeting);
	} //end main()
	
} //end Greet
