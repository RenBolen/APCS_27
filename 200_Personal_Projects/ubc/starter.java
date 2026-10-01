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
		System.out.println("------------------------------------------");
		System.out.println("Binary Claculator");
		System.out.println("------------------------------------------");
		System.out.print("Enter your number here: ");
		int baseTen =  sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.print(baseTen + " in binary is ");
		int input = baseTen;
		int binaryLength = 0;
		int binaryPow = 0;
		String binary = "";
		
			if (input >= Math.pow(2, binaryDigit)) {
				input -= (int)Math.pow(2, binaryDigit);
				binary += "1";
			}
			if (input >= Math.pow(2, binaryDigit)) {
				binary += "0";
			}
		}
		System.out.println(binary + ".");
	}
}
