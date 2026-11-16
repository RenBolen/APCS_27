/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void target(int[] arr) {
		int target = (int) (Math.random() * 10 + 1);
		boolean targetHit = false;
		int counter = 0;
		System.out.println("The target number is " + target + ".");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("[" + i + "]");
				targetHit = true;
				counter++;
			}
		}
		if (targetHit == false) {
			System.out.println("There were no numbers equal to the target.");
		}
		else {
			System.out.println("There were " + counter + " of the target number.");
		}
	}

	public static void consecutive(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("[" + i + "]" + " and " + "[" + (i + 1) + "] are both " + arr[i] + ".");
			}
		}
	}
	
	public static void main(String args[]) {
		int arrayNums = 20;
		int arr[] = new int [arrayNums];
		for (int i = 0; i < arrayNums; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		target(arr);
		System.out.println();
		System.out.println("Consecutive Duplicates");
		consecutive(arr);
	}
}
