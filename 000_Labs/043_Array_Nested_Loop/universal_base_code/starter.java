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
		System.out.println("How tall would you like your rectangle to be?");
		int height = sc.nextInt();
		System.out.println("How wide would you like your rectangle to be?");
		int width = sc.nextInt();
		String clear = sc.nextLine();
		System.out.println("What character or symbol would you like your character to be made of?");
		String symbol = sc.nextLine();
		while (symbol.length() > 1) {
			System.out.println("Please input a single symbol.");
			symbol = sc.nextLine();
		}
		System.out.println("========================================================");
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}

		
	}
}
