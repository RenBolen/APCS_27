/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int num, int exponent) {
		int x = num;
		int y = exponent;
		int output = 1;
		if (y > 0) {
			while (y > 0) {
			output = output * x;
			y--;
			}
		}
		else if (y == 0) {
			output = 1;
		}
		return output;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Print an integer: ");
		int num = sc.nextInt();
		System.out.print("Print the exponent: ");
		int exponent = sc.nextInt();
		System.out.println(pow(num, exponent));
	}
}
