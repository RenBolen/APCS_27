/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int money = 100;
		System.out.println("🟥🟨🟥🟨🟥🟨🟥🟨");
		System.out.println("🟨    Slots   🟥");
		System.out.println("🟥🟨🟥🟨🟥🟨🟥🟨");
		System.out.println("Slots Rules");
		System.out.println("  - You start with $100 and if you get to zero you lose");
		System.out.println("  - There will be three random numbers 1-10");
		System.out.println("  - If two of the numbers are equal you will double your money");
		System.out.println("  - If all three numbers are equal you will triple your money");
		System.out.println("  - Answer questions with a Yes, yes, Y, or y format");
		System.out.println();
		String answer;
		int y = 0;
		while (money > 0) {
			System.out.println("Would you like to spin the slots?");
			if (y > 0) {
			String clear = sc.nextLine();
			}
			y++;
			answer = sc.nextLine();
			System.out.println();
			while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("n")) {
				System.out.print("The answer was invalid. Please enter Yes, No, Y, N, y, or n: ");
				answer = sc.nextLine();
			}
			if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
			System.out.println("Get out of here!");
			System.out.println("You ended with $" + money + ".");
			break;
		}
			if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
			System.out.print("How much money will you bet: $");
			int bet = sc.nextInt();
			System.out.println();
			while (bet > money || bet < 0) {
				System.out.println("You do not have this much money.");
				System.out.println("Please bet an amount between 0 and " + money + ".");
				System.out.print("How much money will you bet (0-" + money + "): ");
				bet = sc.nextInt();
				System.out.println();
			}
			money -= bet;
			int random1 = (int)(Math.random() * 10 +1);
			int random2 = (int)(Math.random() * 10 +1);
			int random3 = (int)(Math.random() * 10 +1);
			System.out.println("=============");
			System.out.println("| " + random1 + " | " + random2 + " | " + random3 + " | ");
			System.out.println("=============");
			if (random1 == random2 && random2 == random3) {
				money += bet * 3;
				System.out.println("You won the Jackpot!");
				System.out.println("You now have $" + money + ".");
			}
			else if (random1 == random2 || random2 == random3 || random1 == random3) {
				money += bet * 2;
				System.out.println("You got doubles!");
				System.out.println("You now have $" + money + ".");
			}
			else {
				System.out.println("You lost.");
				System.out.println("You now have $" + money + ".");
			}
			System.out.println();
		}

		}
		if (money <= 0) {
			System.out.println("You ran out of money!");
			System.out.println("Come back again to get scammed out of more money!");
			}
	
	}
}
