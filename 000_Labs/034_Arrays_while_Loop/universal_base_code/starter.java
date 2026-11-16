/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int list [] = new int [1000];
		int i = 0;
		while (i < 1000) {
			list [i] = (int) (Math.random() * 1000);
			i++;
		}
		while (i > 0) {
			System.out.println(list[1000 - i]);
			i--;
		}

		
	}
}
