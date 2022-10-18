import java.util.Scanner;
 
public class GuessingGame 
{
 
    // Implementing number guessing game
    public static void guessingNumberGame()
    {
        // Incorparating Scanner Class
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100 * Math.random());
 
        // Given a trials
        int a = 5;
 
        int i, guess;
 
        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
 
        // Iterate over a Trials
        for (i = 0; i < a; i++) {
 			System.out.println("Guess the number:");
 		// Take input for guessing
            guess = sc.nextInt();
 
        // If the number is guessed
        if (number == guess) { 
        	System.out.println( "Congrats!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != a - 1) {
                System.out.println( "The number is " + "greater than " + guess);
            }
            else if (number < guess && i != a - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
 			if (i == a) {
            	System.out.println( "You have used up all" + "  trials.");
 				System.out.println("The number was " + number);
        }
    }
 		// Driver Code
			 public static void main(String arg[])
    {
 		// Function Call
        	guessingNumberGame();
    }
}