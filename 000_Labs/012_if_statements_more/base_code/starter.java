/*
 *	Author:  Ren Bolen
 *  Date: September 21, 2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner firstNum = new Scanner(System.in);
		Scanner secondNum = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num1 = firstNum.nextInt();
		System.out.print("Enter another integer: ");
		int num2 = secondNum.nextInt();

		if (num1 == num2) {
		System.out.println(num1 + " and " + num2 + " are equal!");
		}
		if (num1 != num2) {
		System.out.println(num1 + " and " + num2 + " are not equal.");
		}
	}
}
