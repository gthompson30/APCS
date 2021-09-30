import java.util.Scanner;

public class NameAge {

   public static void main(String[] args) {
       String name;
       int age;

       Scanner in = new Scanner(System.in);

       System.out.print("What's your name? ");
       name = in.nextLine();
       System.out.print("What's your age? ");
       age = in.nextInt();
       System.out.println("Hello, " + name + ", you are " + age + " years old.");
   }
}
