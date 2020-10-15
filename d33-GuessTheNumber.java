import java.util.Scanner;
import java.util.Random;

//this is the version where the player has to guess a number. Next one will be where the computer guesses the number.

public class GuessTheNumber {

	public static void main(String[] args) {
		Random n = new Random();
		int low = 1;
		int high = 100;
		int number = n.nextInt(high-low)+low;
		
		Scanner player = new Scanner(System.in);
		int guess;

		
		do {
		System.out.println("Welcome Player");
		System.out.println("Please guess a number between 1 and 100: ");
		guess = player.nextInt();
		System.out.println("You guessed: "+guess);

		
		
		if (guess == number) {
			System.out.println("You guessed right! Congratulations!");
		} else if (guess < number) {
			System.out.println("Not quite. Too low. Guess again.");
		} else if (guess > number) {
			System.out.println("Not quite. Too high. Guess again.");
		}
		
		} while (guess != number);
		
		
	}

}




//variable lowerLimit
//variable upperLimit
//number
//midpoint
