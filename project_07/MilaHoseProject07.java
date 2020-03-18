import java.util.Scanner;

class MilaHoseProject07 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int choice = 0;

    // Get number to initialize test array with
    System.out.print("\nPlease choose an integer value for the length of the test array: ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.print("\nYour array has been initialized with the following values:\n\n");
    initializeArray(arr);
    printArray(arr);

    do {
      printMenu();
      System.out.print("\nPlease choose from the menu options above: ");
      choice = input.nextInt();

      switch (choice) {
        case 1:
          System.out.println("\nThe largest array element is: " + largest(arr));
          break;
        case 2:
          System.out.println("\nThe smallest array element is: " + smallest(arr));
          break;
        case 3:
          System.out.println("\nThe array range is: " + range(arr));
          break;
        case 4:
          System.out.println("\nThe array average is: " + average(arr));
          break;
        case 5:
          // Get search key
          System.out.print("\nEnter a search key: ");
          int key = input.nextInt();
          int foundIndex = linearSearch(arr, key);

          if (foundIndex >= 0) {
            System.out.println("\nThe key " + key + " exists at index " + foundIndex + "!");
          } else {
            System.out.println("\nThe key " + key + " does not exist!");
          }
          break;
        case 6:
          System.out.println("\nThe sorted array is: ");
          selectSort(arr);
          printArray(arr);
          break;
      }
    } while (choice != 7);

    // End program
    System.out.println("\nThanks for testing. Goodbye!\n");
    System.exit(0);
  }
  
  // assign each element in array with a random
  // number between 1 and 100, inclusive
  public static void initializeArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random() * 99) + 1;
    }
  }	

  // print out all array elemnts, 5 elements per line
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if ((i + 1) % 5 == 0) {
        System.out.println(arr[i]);
      } else {
        System.out.print(arr[i] + " ");
      }
    }
  }

  // find the largest element in the array
  public static int largest(int[] arr) {
    int largest = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }

    return largest;
  }
			
  // find the smallest element in the array
  public static int smallest(int[] arr) {
    int smallest = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }

    return smallest;
  }

  // find the range of all array elements
  // the range is defined as the difference betweent eh largest and smallest elements
  public static int range(int[] arr) {
    return largest(arr) - smallest(arr);
  }

  // find the average value of all elements in array
  public static double average(int[] arr) {
    double total = 0.0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }

    return total / arr.length;
  }

  // return the index of the first occurence of the key in arr
  // if key is not found in array, return -1
  public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        return i;
      }
    }

    return -1;
  }

  // sort the array from least to largest by using select sort algorithm
  public static void selectSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int currentMin = arr[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (currentMin > arr[j]) {
          currentMin = arr[j];
          currentMinIndex = j;
        }
      }

      if (currentMinIndex != i) {
        arr[currentMinIndex] = arr[i];
        arr[i] = currentMin;
      }
    }
  }

  // display menu
  public static void printMenu() {
    System.out.println("\n========================================");
    System.out.println("                  MENU                  ");
    System.out.println("1. Print largest array element          ");
    System.out.println("2. Print smallest array element         ");
    System.out.println("3. Print array range                    ");
    System.out.println("4. Print average of array elements      ");
    System.out.println("5. Search for key in array              ");
    System.out.println("6. Sort the array                       ");
    System.out.println("7. Quit                                 ");
    System.out.println("========================================\n");
  }
}