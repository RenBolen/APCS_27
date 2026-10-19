/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static String add(String a, String b) {
		return a + " " + b;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Print a string: ");
		String a = sc.nextLine();
		System.out.print("Print another string: ");
		String b = sc.nextLine();
		System.out.println(add(a, b));
	}
}
