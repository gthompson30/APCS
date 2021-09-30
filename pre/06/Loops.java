import java.util.Scanner;

public class Loops {

  public static long exponent(double x, int n) {
    long total = 1;
    for (int i = 0; i < n; i++) {
      total *= x;
    }
    return total;
  }

  public static long factorial(int n) {
    long total = 1;
    for (int i = 1; i <= n; i++) {
      total *= i;
    }
    return total;
  }

  // note: this mostly works, although it has some difficulties with larger values of n and/or x, because of integer overflow errors.
  // i originally used doubles, but switched to long's so that it has less of an issue with integer overflows, but it still can be an issue.
  public static double myexp(double x, int n) {
    long exponent = 1;
    long factorial = 1;
    double total = 1;

    for (int i = 1; i < n; i++) {
      exponent *= x;
      factorial *= i;
      total += exponent / (double) factorial;
    }

    return total;
  }

  public static void check(double x) {
    final int TERMS = 20;
    System.out.printf("%4d  %20f  %f\n", (int) x, myexp(x, TERMS), Math.exp(x));
  }

  public static void main(String[] args) {
    //Scanner in = new Scanner(System.in);

    for (double i = 0.1; i <= 100; i *= 10) {
      check(i);
    }

    for (double i = -0.1; i >= -100; i *= 10) {
      check(i);
    }
  }
}
