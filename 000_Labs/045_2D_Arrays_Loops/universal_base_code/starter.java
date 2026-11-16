/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void rowAverage(int row, int[][] arr) {
		double average = 0;
		for (int x = 0; x < arr[0].length; x++) {
			average += arr[row][x];
		}
		average = (double) average / arr[0].length;
		System.out.println("The average of row " + row + " is " + average + ".");
	} 
	public static void average(int[][] arr) {
		double average = 0;
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[0].length; y++) {
				average += (double) arr[x][y];
			}
		}
		average /= (arr.length * arr[0].length);
		System.out.println("The average of the array was " + average + ".");
	}
	public static void printAll(int[][] arr) {
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[0].length; y++) {
				System.out.print(arr[x][y] + " ");
			}
		}
	}
	public static void main(String args[]) {
		int arr[][] = new int [3][4];
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[0].length; y++) {
				arr[x][y] = (int) (Math.random() * 10 + 1);
			}
		}
		rowAverage(0, arr);
		System.out.println();
		average(arr);
		System.out.println();
		printAll(arr);
		System.out.println();
	}
}
