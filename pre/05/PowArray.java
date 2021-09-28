import java.util.Random;

// Note: this contains both PowArray and histogram because I just decided to put all answers to Exercise 1 here

public class PowArray {

  public static double[] powArray(double[] a, double power) {
    double[] exponentiated = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      exponentiated[i] = Math.pow(a[i], power);
    }

    return exponentiated;
  }

  public static int[] histogram(int[] scores, int numCounters) {
    int[] counters = new int[100];

    for (int score : scores) {
      counters[score]++;
    }
    return counters;
  }

  public static void printIntArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length - 1; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.print(array[array.length - 1] + "]\n");
  }

  public static void main(String[] args) {
    // powArray() tests
    double[] first = {1.0, 2.0, 3.0, 4.0, 5.0};
    double[] newArray = powArray(first, 3.0);
    for (int i = 0; i < newArray.length; i++) {
      System.out.println(newArray[i]);
    }

    // histogram() tests
    Random random = new Random();
    int[] testArray = new int[100];
    for (int i = 0; i < testArray.length; i++) {
      testArray[i] = random.nextInt(100);
    }

    printIntArray(testArray);
    printIntArray(histogram(testArray, 100));
  }
}
