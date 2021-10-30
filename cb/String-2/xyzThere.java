public class xyzThere {
	public boolean xyzThere( String str ) {
		int streak = 0;
		
		for (int c = 0; c < str.length() - 2; c++) {
			if (str.charAt(c) == 'x' &&
			    str.charAt(c + 1) == 'y' &&
			    str.charAt(c + 2) == 'z') {
				if (c == 0 || str.charAt(c - 1) != '.') {
					return true;
				}
			}
		}
		return false;
	}
}
