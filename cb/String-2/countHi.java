public class countHi {
	public int countHi(String str) {
		return catDog.countInstances(str, "hi");
	}
	
	public static void main( String[] args ) {
		System.out.println(countHi("hiHIhi") + " ... should be 2");
		System.out.println(countHi("Hi is no HI on ahI") + " ... should be 0");
	}
}
