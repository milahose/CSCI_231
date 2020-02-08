import java.util.Scanner;

class MilaHoseProject03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get score from user
    System.out.print("Enter your score (0 -- 100): ");
    int score = input.nextInt();

    // Check for valid input, exit program if invalid
    if (score < 0 || score > 100) {
      System.out.println("Invalid score! Goodbye.");
      System. exit(0);
    }

    /*
      IF BLOCK COMMENTED AWAY FOR HOMEWORK

      // Determine letter grade
      if (score >= 90 && score <= 100) {
        System.out.println("Your grade is: A");
      } else if (score >= 80 && score <= 89) {
        System.out.println("Your grade is: B");
      } else if (score >= 70 && score <= 79) {
        System.out.println("Your grade is: C");
      } else if (score >= 60 && score <= 69) {
        System.out.println("Your grade is: D");
      } else {
        System.out.println("Your grade is: F");
      }
    */

    switch (score / 10) {
      case 10: case 9:
        System.out.println("Your grade is: A");
        break;
      case 8:
        System.out.println("Your grade is: B");
        break;
      case 7:
        System.out.println("Your grade is: C");
        break;
      case 6:
        System.out.println("Your grade is: D");
        break;
      default: 
        System.out.println("Your grade is: F");
    }
    
  }
}