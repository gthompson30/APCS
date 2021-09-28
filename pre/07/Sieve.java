public class Sieve {

  public static boolean[] sieve(int n) {
    boolean[] primes = new boolean[n];
    for (int i = 0; i < primes.length; i++) {
      primes[i] = true;
    }

    int start = 2;
    int currentValue = start * 2;
    int checking = start + 1;
    primes[0] = false;

    while (start < n) {
      while (currentValue < n) {
        primes[currentValue - 1] = false;
        currentValue += start;
      }
      // set start to the next prime value after start
      while (!primes[checking - 1]) {
        checking++;
      }
      start = checking;
      checking++;
      currentValue = start * 2;
    }
    return primes;
  }

  public static void printBooleanArray(boolean[] x) {
    System.out.print("[");
    for (int i = 0; i < x.length - 1; i++) {
      System.out.print(x[i] + ", ");
    }
    System.out.print(x[x.length - 1]);
    System.out.println("]");
  }

  public static void main(String args[]) {
    boolean[] primes = sieve(100);
    printBooleanArray(primes);
  }
}
