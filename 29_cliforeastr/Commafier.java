public class Commafier {
	
	public static String commafyF( int n ) {
		String strN = Integer.toString(n);
		String output = "";
		int strLen = strN.length();
		
		for (int i = 0; i < strLen; i++) {
			output += strN.charAt(i);
			if ((strLen - i) % 3 == 1 && i != strLen - 1) {
				output += ",";
			}
		}
		return output;
	}
	
	public static String commafyR( int n ) {
		String strN = Integer.toString(n);
		String output = "";
		int strLen = strN.length();
		
		if (strLen < 3) {
			return strN;
		}
		else {
			return commafyR(strN.substring(3, strLen - 1)) + ", " + strN;
		}
	}
	
	public static void main( String[] args ) {
		System.out.println(commafyF(2147483647));
		System.out.println(commafyR(2147483647));
	}
	
}
