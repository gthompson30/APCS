public class doubleChar {
	public String doubleChar(String str) {
		String output = "";
		
		for (int index = 0; index < str.length(); index++) {
			output += str.charAt(index);
			output += str.charAt(index);
		}
		return output;
	}
	
	public static void main( String[] args ) {
		System.out.println(doubleChar("AAbb") + " ... should be AAAAbbbb");
		System.out.println(doubleChar("Word!") + " ... should be WWoorrdd!!");
	}
}
