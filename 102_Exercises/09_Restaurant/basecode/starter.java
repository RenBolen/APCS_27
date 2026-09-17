/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner owner = new Scanner(System.in);
		Scanner item = new Scanner(System.in);
		Scanner qty = new Scanner(System.in);
		Scanner price = new Scanner(System.in);
		String line1 = "----------------------------------------";
		String line2 = "========================================";
		Double tax = 0.0975;

		System.out.println(line2);
		System.out.println("WELCOME RESTAURANT OWNER");
		System.out.println(line2);
		System.out.println("What is the name of your restaurant?");
		String restaurantName = item.nextLine();
		System.out.print("Name of Restaurant Owner: ");
		String ownerName = owner.nextLine();
		System.out.println();
		System.out.println("Nice to meet you " + ownerName + ", we will be setting up a three item menu for " + restaurantName + " today.");
		System.out.println("What is the first food?");
		String item1 = item.nextLine();
		System.out.println("How many of this food would you like?");
		int qty1 = qty.nextInt();
		System.out.println("What is the price of this food");
		System.out.print("$");
		double price1 = price.nextDouble();
		System.out.println("What is the second food?");
		String item2 = item.nextLine();
		System.out.println("How many of this food would you like?");
		int qty2 = qty.nextInt();
		System.out.println("What is the price of this food");
		System.out.print("$");
		double price2 = price.nextDouble();
		System.out.println("What is the third food?");
		String item3 = item.nextLine();
		System.out.println("How many of this food would you like?");
		int qty3 = qty.nextInt();
		System.out.println("What is the price of this food");
		System.out.print("$");
		double price3 = price.nextDouble();
		System.out.println("What percent would you like to tip?");
		int tip = qty.nextInt();

		double subtotal = (qty1 * price1) + (qty2 * price2) + (qty3 * price3);
		double tip2 = tip / 100.0 + 1;

		System.out.println();
		System.out.println(line2);
		System.out.println(restaurantName + " -Menu for today");
		System.out.println(line2);
		System.out.println(ownerName);
		System.out.println(line1);
		System.out.println("Item          Qty     Price");
		System.out.println(line1);
		System.out.println(item1 + "          " + qty1 + "     " + price1);
		System.out.println(item2 + "          " + qty2 + "     " + price2);
		System.out.println(item3 + "          " + qty3 + "     " + price3);
		System.out.println(line1);
		System.out.println("Subtotal:               $" + subtotal);
		System.out.println("Tax(9.75%):             $" + (subtotal*tax));
		System.out.println("Tip:                    " + (tip) + "%");
		System.out.println("Tip amount:             $" + ((tip2 * subtotal) - subtotal));
		System.out.println(line2);
		System.out.println("Total:                    $" + (tip2 * subtotal));
		System.out.println(line2);
		System.out.println("Thanks for eating at " + restaurantName + "!");
		System.out.println("Come back soon -- Our food will always take a byte out of you!");
	}	
}
