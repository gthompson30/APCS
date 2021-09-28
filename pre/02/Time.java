public class Time {

  public static void main(String[] args) {
    int hour = 22;
    int minute = 13;
    int second = 38;

    int sinceMidnight = (3600 * hour) + (60 * minute) + second; // Originally was 79456, now is 80018, which means time was 562s
    int untilMidnight = 86400 - sinceMidnight;
    int percentDone = 100 * sinceMidnight / 86400;

    System.out.println("Seconds since midnight: " + sinceMidnight);
    System.out.println("Seconds until midnight: " + untilMidnight);
    System.out.println("Percent of day complete: " + percentDone);
  }
}
