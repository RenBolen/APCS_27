/*
 *	Author: Ren Bolen
 *  Date: September 20, 2026
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Scanner animal = new Scanner(System.in);
		int question = (int) (Math.random() * 3 + 1);
		System.out.println();
		System.out.println("Try to answer the questions and get it right!");
		System.out.println("(If it is a word, the first letter should be capitalized.)");
		System.out.println();
		if (question == 1){
			System.out.println("It is a number.");
;			int guess1 = sc.nextInt();
			if (guess1 != 2) {
				System.out.println("That is incorrect.");
				System.out.println("Hint 1: It is the number of states in the U.S. bigger than California.");
				guess1 = sc.nextInt();
			}
			if (guess1 != 2) {
				System.out.println("That is incorrect.");
				System.out.println("Hint 2: It is the smallest even and prime number.");
				guess1 = sc.nextInt();
			}
			if (guess1 != 2) {
				System.out.println("That is incorrect. The answer was 2.");
			}
			else{
				System.out.println("You are correct!");
			}
		}

		if (question == 2){
			System.out.println("It is an animal");
			String text = sc.nextLine();
;			String guess1 = sc.nextLine();
			String answer = "Kangaroo";
			if (guess1 != answer) {
				System.out.println("That is incorrect.");
				System.out.println("Hint 1: It is the largest mammal on its continent.");
				guess1 = sc.nextLine();
			}
			if (guess1 != answer) {
				System.out.println("That is incorrect.");
				System.out.println("Hint 2: This animal is native to Australia.");
				guess1 = sc.nextLine();
			}
			if (guess1 != answer) {
				System.out.println("That is incorrect. The answer was a Kangaroo.");
			}
			else{
				System.out.println("You are correct!");
			}
		}

		if (question == 3){
			System.out.println("it is a drink ");
			String text = sc.nextLine();
			String guess1 = sc.nextLine();
			String answer = "Tea";
			if (guess1 != answer) {
				System.out.println("That is incorrect.");
				System.out.println("Hint 1: Its the most popular drink besides water.");
				guess1 = sc.nextLine();
			}
			if (guess1 != answer) {
				System.out.println("That is incorrect.");
				System.out.println("Hint 2: This drink is originally from east and south-east Asia..");
				guess1 = sc.nextLine();
			}
			if (guess1 != answer) {
				System.out.println("That is incorrect. The answer was tea.");
			}
			else{
				System.out.println("You are correct!");
			}
		}
	}
}
