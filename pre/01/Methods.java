import java.util.Scanner;

public class Methods {

  public static boolean isDivisible(int n, int m) {
    return n % m == 0;
  }

  // i used ints as arguments for this excercise as it did not specify, although it would be easy to switch to doubles or floats
  public static boolean isTriangle(int a, int b, int c) {
    if ((a <= (b + c)) && (b <= (a + c)) && (c <= (a + b))) {
      return true;
    }
    return false;
  }

  public static int ack(int m, int n) {
    if (m > 0) {
      if (n > 0) {
        return ack(m - 1, ack(m, n - 1));
      } else if (n == 0) {
        return ack(m - 1, 1);
      }
    } else if (m == 0) {
      return n + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int m, n;
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter m: ");
      m = in.nextInt();
      System.out.print("Enter n: ");
      n = in.nextInt();

      System.out.println(ack(m, n));
    }
  }
}
