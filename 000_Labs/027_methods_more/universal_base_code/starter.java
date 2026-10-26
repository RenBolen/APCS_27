/*
 *	Author:  Ren Bolen
 *  Date: 10/23/2026
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount bank = new BankAccount();
		Scanner sc = new Scanner (System.in);
		System.out.println("========================");
		System.out.println("Automatic Teller Machine");
		System.out.println("========================");
		System.out.println("What info would you like to enter into you bank account?");
		System.out.println("	1 - Nothing");
		System.out.println("	2 - Name of Owner");
		System.out.println("	3 - Name and Deposit");
		System.out.print("Choice: ");
		int choice = sc.nextInt();
		String erase = sc.nextLine();
		System.out.println();
		if (choice == 1){
			bank.displayAccountInfo();
		}
		else if (choice == 2){
			System.out.println("What is your name?");
			String name = sc.nextLine();
			bank = new BankAccount(name);
			bank.displayAccountInfo();
		}
		else if (choice == 3){
			System.out.println("What is your name?");
			String name = sc.nextLine();
			System.out.println("What is your initial deposit?");
			double deposit = sc.nextDouble();
			erase = sc.nextLine();
			bank = new BankAccount(name, deposit);
			bank.displayAccountInfo();
		}
		else {
			System.out.println("Thank you for inputing a useless number.");
		}
		if (choice == 1 || choice == 2 || choice ==3) {
			System.out.println("Would you like to check your balance?");
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Yes")) {
				System.out.println(bank.checkBalance());
				System.out.println();
				System.out.println("Thank you for using the ATM!");
			} 
			else {
				System.out.println("Thank you for using the ATM!");
			}
		}
	}
}
