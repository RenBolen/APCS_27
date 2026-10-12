/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times would you like your name printed?");
		int repeat = sc.nextInt();
		System.out.println();
		while(true) {
			if (repeat <= 0) {
				break;
			}
			System.out.println(name);
			repeat--;
		}



		
	}
}
