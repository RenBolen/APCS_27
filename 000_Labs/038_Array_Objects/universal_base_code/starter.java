/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int fightingNum = 30000000;
		
		Wizard[] wizard = new Wizard[fightingNum];
		for (int i = 0; i < fightingNum; i++) {
			wizard[i] = new Wizard();
		}
		Warrior[] warrior = new Warrior[fightingNum];
		for (int i = 0; i < fightingNum; i++) {
			warrior[i] = new Warrior();
		}

		int currentWizard = 0;
		int currentWarrior = 0;
		while(!wizard[fightingNum - 1].isDead() && !warrior[fightingNum - 1].isDead()) {
			wizard[currentWizard].attack(warrior[currentWarrior]);
			if (warrior[currentWarrior].isDead()) {
				currentWarrior++;
			}
			if (!warrior[fightingNum - 1].isDead()) {
				warrior[currentWarrior].attack(wizard[currentWizard]);
				if (wizard[currentWizard].isDead()) {
				currentWizard++;
				}
			}
		}
		System.out.println();
		if (!wizard[fightingNum - 1].isDead()) {
			System.out.println("The wizards won the battle!");
			System.out.println("Remaining Wizards: " + (fightingNum - currentWizard));
		}
		else {
			System.out.println("The warriors won the battle!");
			System.out.println("Remaining Warriors: " + (fightingNum - currentWarrior));
		}

	}
}
