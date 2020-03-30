import java.util.Scanner;

public class MilaHoseProject08 {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    int choice = 'Y';

    do {
      System.out.print("\nEnter a number between 0 and 511: ");
      int number = input.nextInt();
      int[] nums = decimalToBinary(number);

      // Print heads or tails value
      System.out.println();
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
          System.out.print("H ");
        } else {
          System.out.print("T ");
        }

        if ((i + 1) % 3 == 0) {
          System.out.println();
        }
      }


      System.out.print("\n\nWould you like to test another number? Y/N: ");
      choice = Character.toUpperCase(input.next().charAt(0));
      input.nextLine();

    } while (choice == 'Y');
  }

  public static int[] decimalToBinary(int n) {
    int[] nums = new int[9];
  
    // Add the numbers (1's and 0's) to an aray
    for (int i = nums.length - 1; i >= 0; i--) {
      if (n % 2 == 0) {
        nums[i] = 0;
      } else {
        nums[i] = 1;
      }
      n /= 2;
    }
    
    return nums;
  }
}