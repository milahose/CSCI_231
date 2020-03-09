import java.util.Scanner;

class MilaHoseProject06 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char keepTesting = 'Y';

    do {
      // Get string
      System.out.print("\nEnter a string: ");
      String testString = input.nextLine();

      // Get char
      System.out.print("Enter a char: ");
      char testChar = input.next().charAt(0);

      // output string result
      System.out.print("\nThe result of calling function int countLetters(String	s) is: ");
      System.out.print(countLetters(testString));

      // output char result
      System.out.print("\nThe result of calling function int countLetters(String	s, char c) is: " );
      System.out.print(countLetters(testString, testChar));

      System.out.print("\n\nDo you want to do another test? Y/N: ");
      keepTesting = Character.toUpperCase(input.next().charAt(0));
      input.nextLine();

    } while (keepTesting == 'Y');

    // End program
    System.out.println("\nGoodbye!\n");
    System.exit(0);
  }
  
  public static int countLetters(String	s) {
    int totalLetters  = 0;
    
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i))) {
        totalLetters++;
      }
    }

    return totalLetters;
  }	

  public static int countLetters(String	s, char c) {
    char testC = Character.toLowerCase(c);
    int totalMatches = 0;
  
    if (!Character.isLetter(c)) {
      return -1;
    }

    for (int i = 0; i < s.length(); i++) {
      if (Character.toLowerCase(s.charAt(i)) == testC) {
        totalMatches++;
      }
    }

    return totalMatches;
  }
}