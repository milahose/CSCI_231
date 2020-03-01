import java.util.Scanner;

class MilaHoseProject05 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char keepCalculating = 'Y';

    System.out.println("\n===================================");
    System.out.println("Welcome to the Mortgage	Calculator!");
    System.out.println("===================================\n");

    do {
      // Get principal
      System.out.print("Enter the principal to borrow: $");
      int principal = input.nextInt();
      double remainingPrincipal = principal;

      // Get interest rate
      System.out.print("\nEnter the interest rate in decimal: ");
      double interestRate = input.nextDouble();
      double monthlyRate = interestRate / 12.0;

      // Get loan term
      System.out.print("\nEnter the term (in years): ");
      int term = input.nextInt() * 12;

      System.out.printf("\n%10s%10s%21s%20s%17s%10s\n", "Month", "Payment", 
        "Monthly Interest", "Monthly Principal", "Total Interest", "Balance");

      
      /*
        WHILE LOOP IMPLEMENTATION 

        int count = 0;
        while (count < term) {
          double periodInterest = Math.pow(1 + monthlyRate, count + 1);
          double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -term));
          double balance = periodInterest * principal - (((periodInterest - 1) * monthlyPayment) / monthlyRate);
          double totalInterestPaid = monthlyPayment * (count + 1) - (principal - balance);
          double monthlyInterestPaid = (remainingPrincipal * interestRate) / 12;
          double monthlyPrincipalPaid = monthlyPayment - monthlyInterestPaid;
          remainingPrincipal = balance;
    
          System.out.printf("%10d%4s%8.2f%8s%7.2f%11s%8.2f%12s%8.2f%6s%9.2f\n", (count + 1), '$', monthlyPayment, 
          '$', monthlyInterestPaid, '$', monthlyPrincipalPaid, '$', totalInterestPaid, '$', balance); 

          count++;
        }
      */

      // FOR LOOP IMPLEMENTATION
      for (int i = 0; i < term; i++) {
        // Calculate all totals for table
        double periodInterest = Math.pow(1 + monthlyRate, i + 1);
        double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -term));
        double balance = periodInterest * principal - (((periodInterest - 1) * monthlyPayment) / monthlyRate);
        double totalInterestPaid = monthlyPayment * (i + 1) - (principal - balance);
        double monthlyInterestPaid = (remainingPrincipal * interestRate) / 12;
        double monthlyPrincipalPaid = monthlyPayment - monthlyInterestPaid;
        remainingPrincipal = balance;
  
        System.out.printf("%10d%4s%8.2f%8s%7.2f%11s%8.2f%12s%8.2f%6s%9.2f\n", (i + 1), '$', monthlyPayment, 
        '$', monthlyInterestPaid, '$', monthlyPrincipalPaid, '$', totalInterestPaid, '$', balance); 
      }

      System.out.print("\nWould you like to calculate another fixed rate mortgage payment? (y/n): ");
      keepCalculating = Character.toUpperCase(input.next().charAt(0));

    } while (keepCalculating == 'Y');

    // End program
    System.out.println("\nThank you for using the Mortgage Calculator! Goodbye!\n");
    System.exit(0);
	}
}