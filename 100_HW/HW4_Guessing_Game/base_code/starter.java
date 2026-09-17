/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int question = (int) (Math.random() * 3 + 1);
		System.out.println("Try to answer the questions and get it right!");
		System.out.println();
		if (question == 1){
			System.out.println("It is a number.");
			Int number = sc.nextInt();
			
			
		}
		if (question == 2){
			System.out.println("It is an animal");
			String text = sc.nextLine();
			
		}
		if (question == 3){
			System.out.println("it is a drink ");
			String text = sc.nextLine();
			
		}
	}
}
