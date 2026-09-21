/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Integer: ");
		int int1 = sc.nextInt();
		System.out.print("Second Integer (different number): ");
		int int2 = sc.nextInt();
		System.out.print("Third Integer (different number): "); 
		int int3 = sc.nextInt();
		if(int1 > int2 && int1 > int3) {
			System.out.println("The largest number is " + int1 + ".");
		}
		if(int2 > int1 && int2 > int3){
			System.out.println("The largest number is " + int2 + ".");
		}
		if(int3 > int1 && int3 > int2){
			System.out.println("The largest number is " + int3 + ".");
		}
		
		if(int1 < int2 && int1 < int3) {
			System.out.println("The smallest number is " + int1 + ".");
		}
		if(int2 < int1 && int2 < int3){
			System.out.println("The smallest number is " + int2 + ".");
		}
		if(int3 < int1 && int3 < int2){
			System.out.println("The smallest number is " + int3 + ".");
		}
	}
}
