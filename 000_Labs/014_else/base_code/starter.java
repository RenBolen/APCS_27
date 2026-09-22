/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numberRandom = (int)(Math.random() * 1000 + 1);
		System.out.println("Guess a random number from 1 - 1000.");
		int guessNum = sc.nextInt();
		if (guessNum == numberRandom) {
			System.out.println("Your guess was correct!");
		}
		else {
			System.out.println("Your guess was incorrect. The number was " + numberRandom + ".");
		}
	}
}
