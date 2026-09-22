/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		int random = (int)(Math.random()* 1000 + 1);
		System.out.println("Guess a number between 1 and 1000!");
		int guess = num.nextInt();
		if (guess > 1000 || guess < 1) {
			System.out.println("This number was not within the range.");
			System.out.println("Please do better at listening to instructions next time.");
		}
		else if (guess == random) {
			System.out.println("Your guess was correct!");
		}
		else if (guess > random) {
			System.out.println("The answer was less that your guess. The answer was " + random + ".");
		}
		else {
			System.out.println("The answer was greater that your guess. The answer was " + random + ".");
		}

	}
}
