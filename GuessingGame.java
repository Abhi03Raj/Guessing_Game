import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Generate a random secret number between 1 and 100.
        int secretNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 5;  // Total number of allowed attempts.
        boolean guessedCorrectly = false;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a secret number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        
        // Loop for the finite number of attempts.
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number correctly!");
                guessedCorrectly = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else { // guess > secretNumber
                System.out.println("Your guess is too high.");
            }
            
            // Provide remaining attempts if any are left.
            if (attempt < maxAttempts) {
                System.out.println("You have " + (maxAttempts - attempt) + " attempts remaining.");
            }
        }
        
        // If the player did not guess correctly within the allowed attempts.
        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The secret number was: " + secretNumber);
        }
        
        scanner.close();
    }
}
