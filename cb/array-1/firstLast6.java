public class firstLast6 {
	public static boolean firstLast6(int[] nums) {
		return (nums[0] == 6) || (nums[nums.length - 1] == 6);
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 6};
		System.out.println(firstLast6(a)  );
		int[] b = {6, 1, 2, 3};
		System.out.println(firstLast6(b) );
		int[] c = {13, 6, 1, 2, 3};
		System.out.println(firstLast6(c));
	}
}
