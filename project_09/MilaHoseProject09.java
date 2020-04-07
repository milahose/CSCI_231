import java.util.Scanner;

class MilaHoseProject09 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    char choice = 'Y';

    do {
      System.out.print("Enter a number of Temperature objects to instantiate: ");

      Temperature temp1 = new Temperature();
      displayTemp(temp1, 1, 0.0, 'C');
      Temperature temp2 = new Temperature(77.0, 'C');
      displayTemp(temp2, 2, 77.0, 'C');
      Temperature temp3 = new Temperature(77.0, 'F');
      displayTemp(temp3, 3, 77.0, 'F');
      Temperature temp4 = new Temperature(25.0, 'C');
      displayTemp(temp4, 4, 25.0, 'C');
      

      // ========================================================
      System.out.print("\n\nWould you like to try again? Y/N: ");
      choice = Character.toUpperCase(input.next().charAt(0));
      input.nextLine();

    } while (choice == 'Y');
  }

  public static void printConvertedTemp (Temperature temp, int n) {
    System.out.println("\nTemperature " + n + " is " + temp.getDegreeInCelsius() + " C.\n");
    System.out.println("Temperature " + n + " is " + temp.getDegreeInFahrenheit() + " F.\n");
  }

  public static void displayTemp(Temperature temp, int n, double degree, char scale) {
    Scanner input = new Scanner (System.in);
    String num = "";

    switch(n) {
      case 1: 
        num = "first";
        System.out.println("\n\nThe first Temperature has been created using the default constructor "
        + "which sets the degree to a default value of 0.0 and the scale to a default value of 'C'.");
        break;
      case 2: 
        num = "second";
        System.out.println("\n\nThe second Temperature has been created using "
        + "the constructor with the double argument: " + degree + ".");
        break;
      case 3: 
      num = "third";
        System.out.println("\n\nThe third Temperature has been created using the constructer "
        + "which sets the degree to a default value of 0.0 and the scale to " + scale + ".");
        break;
      case 4: 
        num = "fourth";
        System.out.println("\n\nThe fourth Temperature has been created using the constructer "
        + "which sets the degree to " + degree + " and the scale to " + scale + ".");
        break;
    }

    printConvertedTemp(temp, n);
    System.out.println("Set the degree (a number) and the scale (F or C) of the " + num + " Temperature.\n");
    
    System.out.print("First set the degree: ");
    double newDegree = input.nextDouble();
    temp.setDegree(newDegree);

    System.out.print("\nNow set the scale: ");
    double newScale = Character.toUpperCase(input.next().charAt(0));
    temp.setDegree(newScale);

    printConvertedTemp(temp, n);
  }
}

class Temperature {
  private double degree;
  private char scale;
  
  Temperature() {
    degree = 0.0;
    scale = 'C';
  }

  Temperature(double _degree) {
    degree = _degree;
    scale = 'C';
  }

  Temperature(char _scale) {
    degree = 0.0;
    scale = _scale;
  }

  Temperature(double _degree, char _scale) {
    degree = _degree;
    scale = _scale;
  }

  public double getDegreeInCelsius() {
    if (scale == 'C') {
      return degree;
    }

    return ((degree - 32) * 5 / 9);
  }

  public double getDegreeInFahrenheit() {
    if (scale == 'F') {
      return degree;
    }

    return ((1.8 * degree) + 32);
  }

  public void setDegree(double _degree) {
    degree = _degree;
  }

  public void setDegree(char _scale) {
    scale = _scale;
  }

  public void setDegree(double _degree, char _scale) {
    degree = _degree;
    scale = _scale;
  }

  public boolean equals(Temperature temp){
    return this.getDegreeInCelsius() == temp.getDegreeInCelsius();
  }

  public boolean isLessThan(Temperature temp){
    return this.getDegreeInCelsius() < temp.getDegreeInCelsius();
  }

  public boolean isGreaterThan(Temperature temp){
    return this.getDegreeInCelsius() > temp.getDegreeInCelsius();
  }
}