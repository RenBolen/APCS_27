/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		if(shrek.isUgly()){
			String statement = new String(shrek.getName() + " IS UGLY!");
		}
		int i = 0;
		shrek.interact();
		for(i = 0; i < 5; i++){
			donkey.interact();
		}
		System.out.println("That printed out " + i + " times");

	}
}
