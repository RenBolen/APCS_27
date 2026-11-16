/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please type a phrase.");
		String sentence = sc.nextLine();
		while (sentence.indexOf(" ") != 0) {
			int x = sentence.length() - 1;
			while (sentence.substring(x).indexOf(" ") == -1) {
				if (x <= 0) {
					break;
				}
				x--;
			}
			System.out.print(sentence.substring(x));
			sentence = sentence.substring(0, x);
			if (x <= 0) {
					break;
				}
		}
		System.out.println(" " + sentence);
	}
}
