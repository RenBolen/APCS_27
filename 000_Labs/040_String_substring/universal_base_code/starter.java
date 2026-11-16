/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String response = sc.nextLine();
		int length = response.length();
		for (int i = 0; i < length; i++) {
			System.out.print(response.substring(i, i + 1) + " ");
		}
		System.out.println();
		for (int i = 0; i < length; i++) {
			System.out.println(i + " " + response.substring(i, i + 1));
		}


		
	}
}
