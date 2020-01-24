/*
  Name: Mila Hose
  Class: CSCI 231 VA
  Assignment: Project 1
  Date: 1/23/20
*/

/*
  ============================
        HOMEWORK ANSWERS
  ============================

  6. Two errors are returned, copied below: 
      MilaHoseProject01.java:38: error: package system does not exist
      system.out.println("Hello, World!");
            ^
      MilaHoseProject01.java:39: error: package system does not exist
          system.out.println("This is my first Java Program");
                ^
      2 errors

  7. Four errors are returned, copied below: 
      MilaHoseProject01.java:25: error: unclosed string literal
      System.out.println("Hello, 
                        ^
      MilaHoseProject01.java:26: error: not a statement
                    World!");
                    ^
      MilaHoseProject01.java:26: error: ';' expected
                    World!");
                        ^
      MilaHoseProject01.java:26: error: unclosed string literal
                    World!");
                          ^
      4 errors

    8. Everything is printed on a single line, as shown below: 
        Hello, World!This is my first Java Program
*/

public class MilaHoseProject01 {
  public static void main(String[] args) {
    System.out.print("Hello, World!");
    System.out.println("This is my first Java Program");
  }
}