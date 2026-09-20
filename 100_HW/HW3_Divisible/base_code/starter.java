/*
 *	Author: Ren Bolen
 *  Date:September 20, 2026
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose an integer: ");
		int num = sc.nextInt();
		System.out.print("Choose another integer: ");
		int num2 = sc.nextInt();
		
		String numStatus = "odd";
		boolean evenOdd = num % 2 == 0;
		if (evenOdd == true) {
			numStatus = "even";
		}
		String divisible = "is not ";
		if (num % 3 + num % 4 + num % 5 == 0) {
			divisible = "is ";
		}
		String numStatus2 = "odd";
		boolean evenOdd2 = num2 % 2 == 0;
		if (evenOdd2 == true) {
			numStatus2 = "even";
		}
		String divisible2 = "is not ";
		if (num2 % 3 + num2 % 4 + num2 % 5 == 0) {
			divisible2 = "is ";
		}

		System.out.println();
		System.out.println("The number " + num + " is " + numStatus + ".");
		System.out.println(num + " " + divisible + "divisible by 3, 4, and 5.");
		System.out.println();
		System.out.println("The number " + num2 + " is " + numStatus2 + ".");
		System.out.println(num2 + " " + divisible2 + "divisible by 3, 4, and 5.");


	}
}
