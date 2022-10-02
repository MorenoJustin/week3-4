import java.util.Scanner;

public class Application {
  /**
   * Retrieves the numbers from standard input.
   * @return The entered numbers.
   */
  public static int[] getInput() {
    try (Scanner input = new Scanner(System.in)) {
      int[] numbers = new int[10];
      for(int index = 0; index < numbers.length; index++) {
        System.out.print("Number " + (index + 1) + ": ");
        numbers[index] = input.nextInt();
      }
      return(numbers);
    }
  }
  
  /**
   * Displays the numbers to standard output.
   * @param numbers The numbers to display
   */
  public static void displayNumbers(int[] numbers) {
    System.out.print("You entered: [");
    for (int index = 0; index < numbers.length; index++) {
      if (index > 0) System.out.print(",");
      System.out.print(numbers[index]);
    }
    System.out.println("]");
    System.out.println();
  }
  
  /***
   * Calculates the sum total of the numbers.
   * @param numbers The numbers to sum
   * @return The total sum
   */
  public static int getTotal(int[] numbers) {
    int total = 0;
    for(int index = 0; index < numbers.length; index++) {
      total += numbers[index];
    }
    return(total);
  }
  
  public static void main(String[] args) {
    System.out.println("Enter the numbers to total/average:");
    int[] numbers = getInput();

    displayNumbers(numbers);
    
    int total = getTotal(numbers);
    System.out.println("Total:   " + total);
    System.out.println("Average: " + (total / (float) numbers.length));
  }
}
