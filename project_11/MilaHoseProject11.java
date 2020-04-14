import java.util.Scanner;

class MilaHoseProject11 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char choice = 'Y';

    do {
      Account[] accounts = new Account[4];
      accounts[0] = new CheckingAccount();
      accounts[1] = new CheckingAccount();
      accounts[2] = new SavingAccount();
      accounts[3] = new SavingAccount();

      System.out.println();

      for (int i = 0; i < 4; i++) {
        String accountType = (i == 0 || i == 1) ? "checking" : "saving";

        accounts[i].setId(i + 1);
        System.out.println("\nThe " + placeKey(i + 1) + " account has been set to ID #" + (i + 1) + ".");

        System.out.print("\nPlease enter a balance for the " + accountType + " account with ID " + (i + 1) + ": ");
        double balance = input.nextDouble();
        accounts[i].setBalance(balance);

        System.out.println("\nThe " + accountType + " account with ID " + (i + 1) 
        + " now has a balance of $" + String.format("%.2f", accounts[i].getBalance()) + ".");

        if (accountType == "saving") {
          System.out.print("\nPlease set the interest rate as a decimal for the " 
          + accountType + " account with ID " + (i + 1) + ": ");
          double interestRate = input.nextDouble();
          ((SavingAccount)accounts[i]).setInterestRate(interestRate);
        }

        System.out.print("\nPlease make a deposit for the " + accountType + " account with ID " + (i + 1) + ": ");
        double deposit = input.nextDouble();
        accounts[i].deposit(deposit);

        System.out.println("\nThe " + accountType + " account with ID " + (i + 1) 
        + " now has a balance of $" + String.format("%.2f", accounts[i].getBalance()) + ".");

        System.out.print("\nPlease make a withdrawel for the " + accountType + " account with ID " + (i + 1) + ": ");
        double withdrawel = input.nextDouble();
        accounts[i].withdraw(withdrawel);

        System.out.println("\nThe " + accountType + " account with ID " + (i + 1) 
        + " now has a balance of $" + String.format("%.2f", accounts[i].getBalance()) + ".\n");

        if (accountType == "saving") {
          ((SavingAccount)accounts[i]).addInterest();

          System.out.println("An interest payment of " + ((SavingAccount)accounts[i]).getInterestRate()
          + "% was made to the " + accountType + " account with ID " + (i + 1) + ".");

          System.out.println("\nThe " + accountType + " account with ID " + (i + 1) 
          + " now has a balance of $" + String.format("%.2f", accounts[i].getBalance()) + ".\n");
        }

        System.out.println(accounts[i].toString());
      }

      // Ask user if they want to repeat the test
      // ========================================================
      System.out.print("\n\nWould you like to try again? Y/N: ");
      choice = Character.toUpperCase(input.next().charAt(0));
      input.nextLine();
  
    } while (choice == 'Y');
  }

  // Get place key based on index
  public static String placeKey(int n) {
    if (n == 1) {
      return "first";
    } else if (n == 2) {
      return "second";
    } else if (n == 3) {
      return "third";
    } else {
      return "fourth";
    }
  }
}

abstract class Account {
  private int id;
  private double balance;

  Account() {
    this(0, 0.0);
  }

  Account(int id, double balance) {
    this.id = id;
    this.balance = balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  public abstract void withdraw(double amount);

  public String toString() {
    return "Account ID: " + id + "\nAccount Balance: $" + String.format("%.2f", balance) + "\n";
  }
}

class CheckingAccount extends Account {
  CheckingAccount() {
    super();
  }

  CheckingAccount(int id, double balance){
    super(id, balance);
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= getBalance()) {
      setBalance(getBalance() - amount);
    }
  }
}

class SavingAccount extends Account {
  private double interestRate;

  SavingAccount() {
    super();
    this.interestRate = 0.0;
  }

  SavingAccount(int id, double balance, double interestRate){
    super(id, balance);
    this.interestRate = interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void withdraw(double amount) {
    if (amount > 0 && ((getBalance() - amount) >= 500)) {
      setBalance(getBalance() - amount);
    }
  }

  public void addInterest() {
    setBalance(getBalance() * (1 + interestRate));
  }
}