import java.util.Arrays;

public class Test {

	public static int set5(int[] arr) {
		arr[0] = 5;
		return 5;
	}

	public static void main(String[] args) {
		int[] a = new int[5];
		set5(a);
		System.out.println(a[0]);
	}

}
