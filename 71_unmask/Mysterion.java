public class Mysterion {

	public static int[] mysterion(int[] arr, int a, int b, int c) {
		int v = arr[c];
		int temp = arr[c];
		arr[c] = arr[b];
		arr[b] = temp;
		int s = a;

		for (int i = a; i < b; i++) {
			if (arr[i] < v) {
				temp = arr[s];
				arr[s] = arr[i];
				arr[i] = temp;
				s++;
			}
		}

		temp = arr[b];
		arr[b] = arr[s];
		arr[s] = temp;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 12, 3};
		int a = 0; int b = 4; int c = 2;
		arr = mysterion(arr, a, b, c);

		System.out.print("{");
		for (int n : arr)
			System.out.print(n + ", ");
		System.out.println("}");
	}

}
