/*
 *	Author: Ren Bolen
 *  Date: October 28, 2026
 *	Collaborator(s): Myself
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog dog1 = new Dog("Random dog", 5);
		Dog dog2 = new Dog("Horse", "great dane");
		boolean dogBark = false;

		if (dog1.isSleeping()) {
			System.out.println(dog1.getName() + " is asleep.");
		}
		else {
			dog1.bark();
			dogBark = true;
		}
		if (dogBark) {
			dog2.bark();
		}
	}
}
