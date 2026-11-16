/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int arr [][] = new int [2][3];
		
		arr [0][0] = 1; 
		arr [0][1] = 2; 
		arr [0][2] = 3; 
		arr [1][0] = 3; 
		arr [1][1] = 2; 
		arr [1][2] = 1;

		double average = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][0] + arr[1][1] + arr[1][2];
		average = (double) average / (arr.length * arr[0].length);
		System.out.println(average);
	}
}
