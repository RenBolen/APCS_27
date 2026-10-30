/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	public String name;
	public boolean ugly;

	public Ogre() {
		name = "Shrek";
		ugly = true;
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(){
		if (ugly) {
			return true;
		}
		else {
			return false;
		}
	}
	public void interact(){
		System.out.println(name + ", what are you doing in my swamp?!");
		return;
	}


}
