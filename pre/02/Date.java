public class Date {

  public static void main(String[] args) {
    String day = "Sunday";
    String month = "August";
    int date = 22;
    int year = 2021;

    System.out.println("American format:");
    System.out.printf("%s, %s %d, %d\n", day, month, date, year);
    System.out.println("European format:");
    System.out.printf("%s %d %s %d\n", day, date, month, year);
  }
}
