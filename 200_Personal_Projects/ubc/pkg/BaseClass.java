/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	private int days = 0;
	private int hunger = 0;
	private int area;
	// 1 is forest, 2 is savanna, 3 is jungle
	private int houseLevel;
	private boolean hasFishRod = false;
	private boolean hasFishTrap = false;
	private boolean hasHuntingTrap = false;
	private boolean hasSpear = false;
	private boolean hasAxe = false;

	public BaseClass(int area) {
		days = 1;
		hunger = 10;
		this.area = area;
		houseLevel = 1;
	}

	public int getDays() {
		return days;
	}
	public int getHunger() {
		return hunger;
	}
	public void addDays(int num) {
		days += num;
	}
	public void addHunger(int num) {
		hunger += num;
		hunger = Math.min(hunger, 10);
	}
	public int getArea() {
		return area;
	}
	public void printArea(int area) {
		if (area == 1) {
			System.out.println("🟦🟦🟦🟦🟦🟦🟦🟦🟦🟩🟩🟩🟩🟩🟩");
			System.out.println("🟩🟦🟦🟩🟩🟦🟦🟦🟩🟩🟩🟩🟩🟩🟩");
			System.out.println("🟩🟩🟩🟩🟩🟩🟦🟦🟩🟩🟩🟩🟩🟩🟩");
			System.out.println("🟩🟩🟩🟩🟩🟩🟦🟦🟦🟩🟩🟩🟩🟩🟩");
			System.out.println("🟫🟦🟦🟫🟫🟦🟦🟩🟦🟦🟫🟩🟫🟩🟫");
			System.out.println("🟫🟦🟦🟫🟫🟦🟩🟩🟩🟦🟦🟫🟫🟫🟦");
			System.out.println("🟩🟩🟩🟩🟩🟩🟦🟫🟦🟦🟦🟫🟫🟫🟦");
			System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟫🟩🟫🟩🟫");
			System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
			System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
		}
		else if (area == 2) {
			System.out.println("🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟨🟨🟦🟦");
			System.out.println("🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟨🟨🟨🟨🟦");
			System.out.println("🟦🟦🟦🟦🟦🟦🟦🟦🟩🟩🟩🟨🟨🟨🟦");
			System.out.println("🟦🟦🟦🟩🟦🟦🟦🟩🟩🟩🟩🟩🟨🟦🟦");
			System.out.println("🟦🟦🟩🟩🟩🟦🟦🟦🟦🟦🟫🟫🟦🟦🟦");
			System.out.println("🟦🟦🟫🟦🟦🟦🟦🟦🟦🟦🟦🟫🟦🟦🟦");
			System.out.println("🟦🟫🟦🟦🟦🟦🟦🟦🟦🟦🟦🟫🟫🟦🟦");
			System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");
			System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");
			System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");
		}
		else {
			System.out.println("🟩🟩🟩🟩🟩🟩🟩🟦🟦🟩🟩🟦🟦🟦🟦");
			System.out.println("🟫🟫🟫🟫🟩🟩🟩🟩🟩🟩🟩🟩🟦🟦🟦");
			System.out.println("🟦🟫🟫🟫🟦🟫🟫🟩🟩🟩🟩🟩🟩🟦🟦");
			System.out.println("🟦🟫🟫🟫🟫🟫🟦🟩🟩🟫🟫🟩🟩🟩🟩");
			System.out.println("🟦🟫🟫🟫🟦🟦🟦🟦🟦🟫🟫🟦🟫🟫🟩");
			System.out.println("🟦🟫🟫🟫🟦🟦🟦🟦🟦🟫🟫🟫🟦🟦🟦");
			System.out.println("🟥🟫🟫🟫🟩🟦🟦🟪🟦🟫🟫🟦🟦🟦🟦");
			System.out.println("🟩🟫🟫🟫🟫🟦🟦🟩🟦🟫🟫🟩🟥🟦🟦");
			System.out.println("🟫🟫🟫🟩🟪🟫🟫🟩🟫🟫🟫🟫🟫🟫🟫");
			System.out.println("🟫🟫🟫🟫🟩🟫🟫🟫🟫🟩🟩🟫🟫🟩🟫");


			
		}
	}
}
