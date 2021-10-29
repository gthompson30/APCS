public class endOther {
	public boolean endOther(String a, String b) {
		if (b.substring(b.length() - a.length(), b.length()).equals(a)) {
			return true;
		}
		if (a.substring(a.length() - b.length(), a.length()).equals(b)) {
                        return true;
                }
		return false;
	}
}
