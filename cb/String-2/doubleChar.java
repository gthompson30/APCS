public class doubleChar {
	public String doubleChar(String str) {
		String output = "";
		
		for (int index = 0; index < str.length(); index++) {
			output += str.charAt(index);
			output += str.charAt(index);
		}
		return output;
	}
}
