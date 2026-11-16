/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] list) {
		for (int i = 0; i < 100; i++)
			if (i ==  99) {
				System.out.println(list[i]);
			}
			else {
				System.out.print(list[i]+ ", ");
			}
	}
	public static int getArrayAverage(int[] list) {
		int sum = list[1];
		for (int i = 0; i < 100; i++) {
			sum += list[i];
		}
		return sum / 100;
	}
	public static int getArrayMax (int[] list) {
		int max = list[1];
		for (int i = 0; i < 100; i++) {
			max = Math.max(max, list[i]);
		}
		return max;
	}
	public static int getArrayMin (int[] list) {
		int min = list [1];
		for (int i = 0; i < 100; i++) {
			min = Math.min(min, list[i]);
		}
		return min;
	}
	public static void main(String args[]) {
		int list[] = new int [100];
		for (int i = 0; i < 100; i++){
			list[i] = (int) (Math.random() * 100 +1);
		}
		toStringArray(list);
		System.out.println("Average: " + getArrayAverage(list));
		System.out.println("Minimum: " + getArrayMin(list));
		System.out.println("Maximum: " + getArrayMax(list));
	}
}
