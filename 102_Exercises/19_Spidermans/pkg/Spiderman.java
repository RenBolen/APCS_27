package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;
	int age;
	String villain;

	public Spiderman() {
		actor = "Unknown";
		age = 0;
		villain = "Unknown";
	}
	public Spiderman(int age) {
		actor = "Unknown";
		this.age = age;
		villain = "Unknown";
	}
	public Spiderman(String actor) {
		this.actor = actor;
		age = 0;
		villain = "Unknown";
	}
	public Spiderman(String actor, int age) {
		this.actor = actor;
		this.age = age;
		villain = "Unknown";
	}
	public Spiderman(String actor, int age, String villain) {
		this.actor = actor;
		this.age = age;
		this.villain = villain;
	}

	public String getActor() {
		return actor;
	}
	public int getAge() {
		return age;
	}
	public String getVillain() {
		return villain;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setVillain(String villain) {
		this.villain = villain;
	}
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
