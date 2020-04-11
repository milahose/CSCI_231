import java.util.Scanner;

class MilaHoseProject10 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int choice = 0;

    // Get a test string from user
    System.out.print("\nPlease enter a string to instantiate: ");
    String str = input.nextLine();

    char[] arr = new char[str.length()];

    // Break down string into array of chars
    for (int i = 0; i < arr.length; i++) {
      arr[i] = str.charAt(i);
    }

    // Create a MyString test object
    MyString testStr = new MyString(arr);

    do {
      printMenu();
      System.out.print("\nPlease choose from the menu options above: ");
      choice = input.nextInt();

      switch (choice) {
        case 1:
          // .charAt() test
          int idx;
          do {
            System.out.print("\nPlease provide an index value between 0-" + (testStr.length() - 1) + ": ");
            idx = input.nextInt();
          } while (idx < 0 || idx >= testStr.length());

          System.out.println("\nThe character at index " + idx + " is '" + testStr.charAt(idx) + "'.");
          break;
        case 2:
          // .length() test
          System.out.println("\nThe length of the string '" + str + "' is " + testStr.length() + ".");
          break;
        case 3:
          // .substring() test
          int startIdx;
          int endIdx;

          do {
            // Get start index for substring
            System.out.print("\nPlease provide a start index value between 0-" + (testStr.length() - 1) + ": ");
            startIdx = input.nextInt();
          } while (startIdx < 0 || startIdx >= testStr.length());

          do {
            // Get end index for substring
            System.out.print("\nPlease provide an end index value between 0-" + (testStr.length() - 1) + ": ");
            endIdx = input.nextInt();
          } while (endIdx < 0 || endIdx >= testStr.length());

          MyString substr = testStr.substring(startIdx, endIdx);
          System.out.print("\nThe value of the substring is: ");
          substr.getString();
          System.out.println(".");
          break;
        case 4:
          // .toLowerCase() test
          System.out.println("\nThe lowercase version of the string is: '" + testStr.toLowerCase() + ".");
          break;
        case 5:
          // .equals() test
          System.out.print("\nPlease enter another string to test against: ");
          input.nextLine();
          String str2 = input.nextLine();

          char[] arr2 = new char[str2.length()];

          // Break down test string into array of chars
          for (int i = 0; i < arr2.length; i++) {
            arr2[i] = str2.charAt(i);
          }

          // Create a new MyString test object
          MyString testStr2 = new MyString(arr2);

          System.out.println("");
          System.out.print("'");
          testStr.getString();
          System.out.print("' is" + (testStr.equals(testStr2) ? "" : " not") + " equal to '");
          testStr2.getString();
          System.out.println("'.");
          break;
        case 6:
          System.out.print("\nPlease enter an integer to test: ");
          int i = input.nextInt();

          MyString valueOfTest = testStr.valueOf(i);
          System.out.print("\nThe integer value of " + i + " is: ");
          valueOfTest.getString();
          break;
      }
    } while (choice != 7);

    // End program
    System.out.println("\nThanks for testing. Goodbye!\n");
    System.exit(0);
  }

  // display menu
  public static void printMenu() {
    System.out.println("\n========================================");
    System.out.println("                  MENU                  ");
    System.out.println("1. Test the .charAt() method            ");
    System.out.println("2. Test the .length() method            ");
    System.out.println("3. Test the .substring() method         ");
    System.out.println("4. Test the .toLowerCase() method       ");
    System.out.println("5. Test the .equals() method            ");
    System.out.println("6. Test the .valueOf() method           ");
    System.out.println("7. Quit                                 ");
    System.out.println("========================================\n");
  }
}

class MyString {
  private char[] data;

  MyString(char[] data) {
    this.data = new char[data.length];
    for (int i = 0; i < data.length; i++) {
      this.data[i] = data[i];
    }
  }

  public char charAt(int i) {
    return data[i];
  }

  public int length() {
    int count = 0;
  
    for (int i = 0; i < data.length; i++) {
      count++;
    }

    return count;
  }

  public MyString substring(int begin, int end) {
    char[] substring = new char[end - begin];
  
    for(int i = 0; i < substring.length; i++) {
      substring[i] = data[begin + i];
    }
  
    return (new MyString(substring));
  }

  public MyString toLowerCase() {
    char[] lowercase = new char[data.length];

    for(int i = 0; i < data.length; i++){
      lowercase[i] = data[i];
      if(lowercase[i] >= 'A' && lowercase[i] <= 'Z') {
        lowercase[i] += 32;
      }
    }
    
    return (new MyString(lowercase));
  }

  public boolean equals(MyString other) {

    if (this.length() != other.length()) {
      return false;
    }
    
    for (int i = 0; i < data.length; i++) {
      if (other.charAt(i) != data[i]) {
        return false;
      }
    }

    return true;
  }

  public MyString valueOf(int i) {
    int length = 0;
    int iCopy = i;

    while (iCopy > 0) {
      iCopy /= 10;
      length++;
    }

    iCopy = i;
    char[] value = new char[length];
    for (int j = length - 1; j >= 0; j--) {
      value[j] = (char)((iCopy % 10) + 48);
      iCopy /= 10;
    }

    return (new MyString(value));
  }

  public void getString() {
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i]);
    }
  }
}
