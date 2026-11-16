/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int list [] = new int [(int)(Math.random() * 150 + 51)];
		for (int i = 0; i < list.length; i++) {
			list [i] = (int) (Math.random() * 100 + 1);
		}
		int min = list [0];
		int max = list [0];
		double average = list [0];
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			max = Math.max(max, list [i]);
		}
		for (int i = 0; i < list.length; i++) {
			min = Math.min(min, list [i]);
		}
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		average = (double) sum / list.length;
		System.out.println("There are " + list.length + " numbers.");
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + average);
	}
}
