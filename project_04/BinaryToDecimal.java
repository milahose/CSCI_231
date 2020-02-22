import java.util.Scanner;

/*
==================================================
									EASY WAY
==================================================

class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get binary digit from user
		System.out.print("Enter a binary digit: ");
		String binaryString = input.nextLine();

		// Output the binary digit converted to decimal notation
		System.out.println("The decimal value for the binary digit " + binaryString + " is: " + Integer.parseInt(binaryString, 2));
	}
}
*/

/*
==================================================
									HARD WAY
==================================================
*/

class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int exponent = 0, decimal = 0;

		// Get binary digit from user
		System.out.print("Enter a binary digit: ");
		String binaryString = input.nextLine();
		
		// Count all characters in string
		int count = binaryString.length() - 1;
		while (count >= 0) {
			// If we find a character that is not '1' or '0',
      // end the program, as it is an invalid binary value
			if (binaryString.charAt(count) != '1' && binaryString.charAt(count) != '0') {
				System.out.println(binaryString + " is an invalid input. Please try again.");
				System.exit(1);
			}

			// Increment the decimal value by the current
			// exponential value (i.e., 2^3)
			if (binaryString.charAt(count) == '1') {
				decimal += Math.pow(2, exponent);
			}

			count--;
			exponent++;
		}

		// Output the binary digit converted to decimal notation
		System.out.println("The decimal value for the binary digit " + binaryString + " is: " + decimal);
	}
}