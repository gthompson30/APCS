public class sameFirstLast {
	public static void main( String[] args ) {
		int[] a = {1, 2, 3};
		System.out.println(sameFirstLast(a));
		int[] b = {1, 2, 3, 1};
		System.out.println(sameFirstLast(b));
		int[] c = {1, 2, 1};
		System.out.println(sameFirstLast(c));
	}

	public static boolean sameFirstLast(int[] nums) {
		return nums.length > 0 && nums[0] == nums[nums.length - 1];
	}
}
