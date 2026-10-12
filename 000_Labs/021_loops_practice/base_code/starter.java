/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Guess the randomly generated number between 1 and 1000.");
		int guess = 0;
		int random = (int)(Math.random() * 1000 + 1);
		int x = 0;
		while (guess != random) {
			x++;
			System.out.println();
			System.out.print("Guess " + x + ": ");
			guess = sc.nextInt();
			if (guess > random){
				System.out.println("The number is lower.");
			}
			if (guess < random) {
			System.out.println("The number is higher.");
			}
		}
		System.out.println("You are correct, the number was " + random + "!");
		System.out.println("It took you " + x + " guesses to get it right.");

	}
}
