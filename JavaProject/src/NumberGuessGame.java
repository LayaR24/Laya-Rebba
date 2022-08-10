   import java.util.Random;
import java.util.Scanner;

   public class NumberGuessGame {

   public static void main(String[] args) {

        int randomNumber, playerguess, guessNum = 0;
        final int maxGuesses = 5;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        randomNumber = generator.nextInt(100)+1;
        System.out.println("Random Number is : "+randomNumber);
        
        System.out.println("Welcome to the game");
        System.out.println("Guess a number between 1 and 100");
            playerguess = scan.nextInt();
            guessNum = 0;
            while (true)
            {
                guessNum++;
                if (playerguess == randomNumber) {
                    System.out.println("Perfect! You got it Right!");
                    break;
                } else if (playerguess < randomNumber)
                    System.out.println("Your guess was too LOW, try some higher numbers.");
                else if (playerguess > randomNumber)
                    System.out.println("Your guess was too HIGH, Try some lower numbers");
                if (guessNum == maxGuesses) {
                    System.out.println("The number was " + randomNumber +"\nBetter luck next time");
                    break;
                }
                System.out.println("Enter your guess (1 to 100):");
                playerguess = scan.nextInt();
            }
            
        System.out.println("Thanks for playing!");
    }
}
 