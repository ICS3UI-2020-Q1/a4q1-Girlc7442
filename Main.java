import java.util.Scanner;

/**
 * Starts at 100 and counts down by 5 to the user number (will not go past)
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for a number
    System.out.println("Please enter an integer to count down to");
    int userNumber = input.nextInt();

    //create a variable to keep track of the number
    int count = 100;

    //outputs "Count Down:" to the screen
    System.out.println("Count Down:");
    
    //Uses a loop to count down to the user number by 5
    while(count >= userNumber){
      System.out.println(count);
      //Decrease the value of the count by 5
      count = count - 5;
    }
    
  }
}
