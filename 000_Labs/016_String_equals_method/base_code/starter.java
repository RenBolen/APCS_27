/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a wizard, warrior, or a rogue?");
		String character = sc.nextLine();
		boolean equalWizard = character.equals("Wizard") || character.equals("wizard");
		boolean equalRogue = character.equals("Rogue") || character.equals("rogue");
		boolean equalWarrior = character.equals("Warrior") || character.equals("warrior");
		
		if (equalWizard || equalRogue || equalWarrior) {
			System.out.println("You are now a " + character + ".");
		}
		else {
			System.out.println("The entered character is not valid.");
		}
	}
}
