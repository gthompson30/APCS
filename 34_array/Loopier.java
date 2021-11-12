public class Loopier {
	// A static method to populate an existing array with randomly generated ints.
	public static int[] generate( int[] array ) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
		}
		return array;
	}
	
	public static String stringify( int[] array ) {
		String out = "{";
		for (int i = 0; i < array.length; i++) {
			out += array[i] + ", ";
		}
		out += "}";
		return out;
	}
	
	public static void main(String[] args) {
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		a = generate(a);
		System.out.println(stringify(a));
	}
}
