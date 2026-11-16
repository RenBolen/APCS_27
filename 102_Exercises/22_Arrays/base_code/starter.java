/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [1001]; 
		int [] arr2 = new int [1001];
		int runs = 0;
		while (arr.length > runs) {
			arr [runs] = (runs + 1) * 3; 
			System.out.print(arr [runs] + " ");
			runs++; 
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		runs = 0;
		while (runs < arr2.length) {
			arr2 [runs] = arr2.length - runs - 1;
			System.out.print(arr2[runs] + " ");
			runs++;
		}
	}
}
