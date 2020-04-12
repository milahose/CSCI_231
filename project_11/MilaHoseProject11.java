class MilaHoseProject11 {
	public static void main(String[] args) {
    Account[] accounts = new Account[4];
    accounts[0] = new CheckingAccount();
    accounts[1] = new CheckingAccount(1, 2000);
    accounts[2] = new SavingAccount();
    accounts[3] = new SavingAccount(1, 2000, 0.06);

    System.out.println();

    accounts[0].setId(1);
    System.out.println("Setting the first checking account ID to 1...");
    accounts[0].setBalance(3000);
    System.out.println("Setting the first checking account balance to 3000...");
    accounts[0].deposit(50);
    System.out.println("A deposit of 50 was made to Account 1. The balance is now " + accounts[0].getBalance() + ".");
    accounts[0].withdraw(100);
    System.out.println("A withdrawel of 100 was made to Account 1. The balance is now " + accounts[0].getBalance() + ".\n");
    System.out.println(accounts[0].toString());

    accounts[1].setId(2);
    System.out.println("Setting the second checking account ID to 2...");
    accounts[1].setBalance(25000);
    System.out.println("Setting the second checking account balance to 25000...");
    accounts[1].deposit(2300);
    System.out.println("A deposit of 2300 was made to Account 2. The balance is now " + accounts[0].getBalance() + ".");
    accounts[0].withdraw(1000);
    System.out.println("A withdrawel of 1000 was made to Account 2. The balance is now " + accounts[0].getBalance() + ".\n");
    System.out.println(accounts[0].toString());

    accounts[2].setId(3);
    System.out.println("Setting the second checking account ID to 2...");
    accounts[2].setBalance(50000);
    System.out.println("Setting the second checking account balance to 25000...");
    ((SavingAccount)accounts[2]).setInterestRate(0.06);
    System.out.println("Setting the second checking account interest rate to 6%...");
    accounts[2].deposit(150);
    System.out.println("A deposit of 2300 was made to Account 2. The balance is now " + accounts[0].getBalance() + ".");
    accounts[2].withdraw(2000);
    System.out.println("A withdrawel of 1000 was made to Account 2. The balance is now " + accounts[0].getBalance() + ".");
    ((SavingAccount)accounts[2]).addInterest();
    System.out.println("An interest payment of " + 
    ((SavingAccount)accounts[2]).getInterestRate() + 
    " was made to Account 2. The balance is now " + accounts[2].getBalance() + ".\n");
    System.out.println(accounts[0].toString());

    accounts[3].setId(4);
    System.out.println("Setting the second checking account ID to 2...");
    accounts[3].setBalance(100000);
    System.out.println("Setting the second checking account balance to 25000...");
    ((SavingAccount)accounts[2]).setInterestRate(0.09);
    System.out.println("Setting the second checking account interest rate to 6%...");
    accounts[3].deposit(2000);
    System.out.println("A deposit of 2300 was made to Account 2. The balance is now " + accounts[0].getBalance() + ".");
    accounts[3].withdraw(7000);
    System.out.println("A withdrawel of 1000 was made to Account 2. The balance is now " + accounts[0].getBalance() + ".");
    ((SavingAccount)accounts[3]).addInterest();
    System.out.println("An interest payment of " + 
    ((SavingAccount)accounts[3]).getInterestRate() + 
    " was made to Account 2. The balance is now " + accounts[2].getBalance() + ".\n");
    System.out.println(accounts[3].toString());
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
    return "Account ID: " + id + "\nAccount Balance: " + balance + "\n";
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