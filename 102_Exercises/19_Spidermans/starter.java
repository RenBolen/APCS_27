/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman spiderman1 = new Spiderman("Tobey Maguire", 48, "Green Goblin"); 
		Spiderman spiderman2 = new Spiderman("Andrew Garfield", 40, "Electro"); 
		Spiderman spiderman3 = new Spiderman("Tom Holland", 27, "The Vulture"); 
		Spiderman spiderman4 = new Spiderman("Ren Bolen", 15, "Essay"); 

		System.out.println(spiderman1.getActor());
		System.out.println(spiderman1.getAge());
		System.out.println(spiderman1.getVillain());
		System.out.println();
		System.out.println(spiderman2.getActor());
		System.out.println(spiderman2.getAge());
		System.out.println(spiderman2.getVillain());
		System.out.println();
		System.out.println(spiderman3.getActor());
		System.out.println(spiderman3.getAge());
		System.out.println(spiderman3.getVillain());
		System.out.println();
		System.out.println(spiderman4.getActor());
		System.out.println(spiderman4.getAge());
		System.out.println(spiderman4.getVillain());
		System.out.println();

		
	}
}
