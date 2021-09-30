public class HelloWorld {
  public static void main(String[] args) {
    System.out.pintln("Hello, World");
  }
}

/*

EXCERCISES:

1. See Initials.java

2. Note: All of the following are Compile-time errors:
   a. Returns the following error:
        HelloWorld.java:2: error: <identifier> expected
          public static void(String[] args) {
                            ^
        1 error
   b. Returns the following error:
       HelloWorld.java:2: error: <identifier> expected
         public static void main(args) {
                                     ^
       1 error
   c. Returns the following error:
       HelloWorld.java:1: error: <identifier> expected
         public class {
                   ^
       1 error
   d. Returns the follow error:
       HelloWorld.java:3: error: cannot find symbol
          println("Hello, World");
           ^
         symbol:   method println(String)
         location: class HelloWorld
       1 error
   e. Returns the following error:
       HelloWorld.java:3: error: cannot find symbol
           System.out("Hello, World");
                 ^
         symbol:   method out(String)
         location: class System
       1 error

3. Note: All of the following are Compile-time errors:
   a. HelloWorld.java:3: error: ';' expected
          System.out.println("Hello, World")
                                            ^
      1 error
   b. HelloWorld.java:3: error: unclosed string literal
          System.out.println(Hello, World");
                                         ^
      1 error
   c. HelloWorld.java:3: error: unclosed string literal
          System.out.println("Hello, World);
                             ^
      1 error
   d. HelloWorld.java:1: error: '{' expected
      public class HelloWorld
                             ^
      1 error
   e. HelloWorld.java:2: error: ';' expected
        public static void main(String[] args)
                                              ^
      HelloWorld.java:5: error: class, interface, or enum expected
      }
      ^
      2 errors
   f. HelloWorld.java:5: error: reached end of file while parsing
      }
       ^
      1 error
   g. HelloWorld.java:4: error: reached end of file while parsing
        }
         ^
      1 error

4. Note: All of the following are Compile-time errors except for a, which is run-time
   a. Error: Main method not found in class HelloWorld, please define the main method as:
         public static void main(String[] args)
      or a JavaFX application class must extend javafx.application.Application
   b. HelloWorld.java:2: error: cannot find symbol
        public static void main(Sting[] args) {
                             ^
        symbol:   class Sting
        location: class HelloWorld
      1 error
   c. HelloWorld.java:1: error: class HellWorld is public, should be declared in a file named HellWorld.java
      public class HellWorld {
        ^
      1 error
   d. HelloWorld.java:3: error: package Sustem does not exist
        Sustem.out.println("Hello, World");
           ^
      1 error
   e. HelloWorld.java:3: error: cannot find symbol
          System.out.pintln("Hello, World");
                    ^
        symbol:   method pintln(String)
        location: variable out of type PrintStream
      1 error

5. You forgot String[] args

*/
