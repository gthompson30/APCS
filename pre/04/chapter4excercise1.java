/*

1. The output is the following:
No, I wug.You wugga wug.I wug.\

2. The first time ping() was invoked:
main   | line 2 - zoop()                   |
zoop   | line 1 - baffle()                 |
baffle | line 2 - ping()                   |
ping   | line 1 - System.out.println("."); |

3. It would link invoke call the function baffle(), which would then call ping()
   again, which would result in an infinite loop of the two functions calling
   eachother.

*/

public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
}

public static void main(String[] args) {
    System.out.print("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
}

public static void baffle() {
    System.out.print("wug");
    ping();
}

public static void ping() {
    System.out.println(".");
}
