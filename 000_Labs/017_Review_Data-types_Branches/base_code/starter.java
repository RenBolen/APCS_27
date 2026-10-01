/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Scanner stat = new Scanner(System.in);
		System.out.println("Would you like to be a wizard, warrior, or a rogue?");
		String character = sc.nextLine();
		boolean equalWizard = character.equals("Wizard") || character.equals("wizard");
		boolean equalRogue = character.equals("Rogue") || character.equals("rogue");
		boolean equalWarrior = character.equals("Warrior") || character.equals("warrior");
		if (equalWizard || equalRogue || equalWarrior) {
			System.out.println("You are now a " + character + ".");

		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title?");
		String title = sc.nextLine();

		System.out.println("You are now a " + character + " called " + name + " " + title + ".");
		
		System.out.println();
		System.out.println("Please assign 4 stats to your character. (0-10 all added to 20 stat points)");
		System.out.print("Strength stat (0-10): ");
		int remainStats = 20;
		int strength = stat.nextInt();
		if (strength >= 0 && strength <= 10 && strength <= remainStats){
			remainStats = remainStats - strength;
			System.out.println("You now have " + strength + " strength and you have " + remainStats + " stat points remaining.");
		}
		else {
			System.out.println("You do not have the required stat points to do this action.");
			System.out.println("Please enter anther strength stat.");
			strength = stat.nextInt();
			remainStats -= strength;
			System.out.println("You now have " + strength + " strength and you have " + remainStats + " stat points remaining.");
		}
		System.out.println();
		System.out.print("Dexterity stat (0-10): ");
		int dexterity = stat.nextInt();
		if (dexterity >= 0 && dexterity <= 10 && dexterity <= remainStats){
			remainStats = remainStats - dexterity;
			System.out.println("You now have " + dexterity + " dexterity and you have " + remainStats + " stat points remaining.");
		}
		else {
			System.out.println("You do not have the required stat points to do this action.");
			System.out.println("Please enter anther dexterity stat.");
			dexterity = stat.nextInt();
			remainStats = remainStats - dexterity;
			System.out.println("You now have " + dexterity + " dexterity and you have " + remainStats + " stat points remaining.");
		}
		System.out.println();
		System.out.print("Intellegence stat (0-10): ");
		int intellegence = stat.nextInt();
		if (intellegence >= 0 && intellegence <= 10 && intellegence <= remainStats){
			remainStats = remainStats - intellegence;
			System.out.println("You now have " + intellegence + " intellegence and you have " + remainStats + " stat points remaining.");
		}
		else {
			System.out.println("You do not have the required stat points to do this action.");
			System.out.println("Please enter anther intellegence stat.");
			intellegence = stat.nextInt();
			remainStats = remainStats - intellegence;
			System.out.println("You now have " + intellegence + " intellegence and you have " + remainStats + " stat points remaining.");
		}
		System.out.println();
		System.out.print("Charisma stat (0-10): ");
		int charisma = stat.nextInt();
		if (dexterity >= 0 && charisma <= 10 && charisma <= remainStats){
			remainStats = remainStats - charisma;
			System.out.println("You now have " + charisma + " charisma and you have " + remainStats + " stat points remaining.");
		}
		else {
			System.out.println("You do not have the required stat points to do this action.");
			System.out.println("Please enter anther charisma stat.");
			charisma = stat.nextInt();
			System.out.println("You now have " + charisma + " charisma and you have " + remainStats + " stat points remaining.");
					remainStats = remainStats - charisma;
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println(name + " " + title + ", the powerful " + character + "!");
		System.out.println("------------------------------------------------------------");
		System.out.println(name + "'s Stats");
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intellegence: " + intellegence);
		System.out.println("Charisma: " + charisma);
		System.out.println("------------------------------------------------------------");
		if (remainStats > 0) {
			System.out.println("Remaining stat points: " + remainStats);
		} 
		}
		else {
			System.out.println("The entered character is not valid. 😱 (Please try again.)");
		}
	}
}