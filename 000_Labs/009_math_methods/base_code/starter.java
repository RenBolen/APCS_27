/*
 *	Author:  Ren Bolen
 *  Date: September 12, 2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = kboard.nextInt();
		System.out.print("Enter another integer: ");
		int y = kboard.nextInt();
		
		System.out.println("The max of " + x + " and " + y + " is " + Math.max(x, y) + ".");
		System.out.println("The square root of " + y + " is " + Math.sqrt(y) + ".");
		System.out.println(x + " to the power of " + y + " is " + Math.pow(x, y) + ".");
	}
}
