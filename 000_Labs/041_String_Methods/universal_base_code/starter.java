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
		System.out.println("Please enter your full name.");
		String name = sc.nextLine();
		if (name.indexOf(" ") > 0){
			System.out.println("Last Name: " + name.substring(name.indexOf(" ") + 1));
		}
		else {
			System.out.println("Could not find a last name.");
		}

		
	}
}
