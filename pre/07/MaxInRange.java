public class MaxInRange {

  public static int maxInRange(int[] array, int lowIndex, int highIndex) {
    if ((lowIndex - highIndex) == 1 || (highIndex - lowIndex) == 1) {
      return Math.max(array[lowIndex], array[highIndex]);
    }

    int split = (lowIndex + highIndex) / 2;
    int firstHalf = maxInRange(array, lowIndex, split);
    int secondHalf = maxInRange(array, split, highIndex);

    if (firstHalf < secondHalf) {
      return secondHalf;
    }
    return firstHalf;
  }

  public static void main(String[] args) {
    int[] nums = {3, 6, 5, 2, 7, 5, 11, 3, 6, 8, 3};

    System.out.println(maxInRange(nums, 0, nums.length - 1));
  }
}
