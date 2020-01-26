import java.util.Scanner;
import java.lang.Math;

class MilaHoseProject02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalCents, remainder, quarters, dimes, nickels, pennies;

    // Get user input
    System.out.println("Enter a change between 1 and 99 cents:");
    // totalCents = input.nextInt();
    totalCents = (int)(Math.random() * 98) + 1; 

    // Calculate change
    quarters = (int)Math.round(Math.floor(totalCents / 25));
    remainder = totalCents - (quarters * 25);
    dimes = (int)Math.round(Math.floor(remainder / 10));
    remainder = remainder - (dimes * 10);
    nickels = (int)Math.round(Math.floor(remainder / 5));
    remainder = remainder - (nickels * 5);
    pennies = (int)Math.round(Math.floor(remainder / 1));
    remainder = 0;

    // Output results
    System.out.println("You have change " + totalCents + " cents. That is:");
    System.out.println(quarters + " quarters");
    System.out.println(dimes + " dimes");
    System.out.println(nickels + " nickels");
    System.out.println(pennies + " pennies");
  }
}