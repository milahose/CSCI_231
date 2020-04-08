import java.util.Scanner;

class MilaHoseProject09 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    char choice = 'Y';

    do {
      Temperature[] temps = new Temperature[4];
      
      // Initialize first element with default constructor
      temps[0] = new Temperature();
      displayTemp(temps[0], 1, 0.0, 'C');

      // Get degree for 2nd Temperature object
      System.out.print("\n\nPlease choose a degree for Temperature two: ");
      double deg2 = input.nextDouble();
      // Initialize 2nd element with degree from user
      temps[1] = new Temperature(deg2);
      displayTemp(temps[1], 2, deg2, 'C');

      // Get degree for 3rd Temperature object
      System.out.print("\n\nPlease choose a scale for Temperature three: ");
      char scale3 = Character.toUpperCase(input.next().charAt(0));
      // Initialize 3rd element with scale from user
      temps[2] = new Temperature(scale3);
      displayTemp(temps[2], 3, 0.0, scale3);

      // Get degree for 4th Temperature object
      System.out.print("\n\nPlease choose a degree for Temperature four: ");
      double deg4 = input.nextDouble();
      // Get scale for 4th Temperature object
      System.out.print("Please choose a scale for Temperature four: ");
      char scale4 = Character.toUpperCase(input.next().charAt(0));
      // Initialize 4th element with degree and scale from user
      temps[3] = new Temperature(deg4, scale3);
      displayTemp(temps[3], 4, deg4, scale3);

      displayTempsCreated(temps);
      displayTempEquality(temps);
      

      // Ask user if they want to repeat the test
      // ========================================================
      System.out.print("\n\nWould you like to try again? Y/N: ");
      choice = Character.toUpperCase(input.next().charAt(0));
      input.nextLine();

    } while (choice == 'Y');
  }

  public static void displayTemp(Temperature temp, int n, double degree, char scale) {
    Scanner input = new Scanner (System.in);
    String num = "";

    // Set the initialize message based on which constructor is used
    switch(n) {
      case 1: 
        num = "first";
        System.out.println("\n\nThe first Temperature has been created using the default constructor which ");
        System.out.println("sets the degree to a default value of 0.0 and the scale to a default value of 'C'.");
        break;
      case 2: 
        num = "second";
        System.out.print("\n\nThe second Temperature has been created using ");
        System.out.print("the constructor with the double argument: " + degree + ".");
        break;
      case 3: 
      num = "third";
        System.out.println("\n\nThe third Temperature has been created using the constructer ");
        System.out.println("which sets the degree to a default value of 0.0 and the scale to '" + scale + "'.");
        break;
      case 4: 
        num = "fourth";
        System.out.println("\n\nThe fourth Temperature has been created using the constructer ");
        System.out.print("which sets the degree to " + degree + " and the scale to '" + scale + "'.");
        break;
    }

    System.out.println("\n\nTemperature " + n + " is " + String.format("%.2f", temp.getDegreeInCelsius()) + " C.\n");
    System.out.println("Temperature " + n + " is " + String.format("%.2f", temp.getDegreeInFahrenheit()) + " F.\n");

    System.out.println("Set the degree (a number) and the scale (F or C) of the " + num + " Temperature.\n");
    
    System.out.print("First set the degree: ");
    double newDegree = input.nextDouble();
    temp.setDegree(newDegree);

    System.out.print("\nNow set the scale: ");
    char newScale = Character.toUpperCase(input.next().charAt(0));
    temp.setDegree(newScale);

    System.out.println("\nNow Temperature " + n + " is " + String.format("%.2f", temp.getDegreeInCelsius())
    + " C, which is " + String.format("%.2f", temp.getDegreeInFahrenheit()) + " F.\n");
  }

  public static void displayTempsCreated(Temperature[] temps) {
    int count = 0;
    // Display all degrees Celcius
    System.out.print("\nIn order of creation the Temperatures in Celcius are: ");
    while (count < 4) {
      System.out.print(String.format("%.2f", temps[count].getDegreeInCelsius()) + (count == 3 ? ". " : ", "));
      count++;
    }

    count = 0;
    // Display all degrees Fahrenheit and reset count
    System.out.print("\nIn order of creation the Temperatures in Fahrenheit are: ");
    while (count < 4) {
      System.out.print(String.format("%.2f", temps[count].getDegreeInFahrenheit()) + (count == 3 ? ". " : ", "));
      count++;
    }

    System.out.println("\n\n");
  }

  public static void displayTempEquality(Temperature[] temps) {
    for (int i = 0; i < 3; i++) {
      for (int j = i; j < 3; j++) {
        // Iterate through array of temps and display equalities for each
        System.out.println("The " + placeKey(i + 1) + " Temperature is" + 
        (temps[i].equals(temps[j + 1]) ? " " : " not ") + "equal to the " + placeKey(j + 2) + ".");

        System.out.println("The " + placeKey(i + 1) + " Temperature is" + 
        (temps[i].isLessThan(temps[j + 1]) ? " " : " not ") + "less than the " + placeKey(j + 2) + ".");

        System.out.println("The " + placeKey(i + 1) + " Temperature is" + 
        (temps[i].isGreaterThan(temps[j + 1]) ? " " : " not ") + "greater than the " + placeKey(j + 2) + ".");

        System.out.println("\n");
      }
    }
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