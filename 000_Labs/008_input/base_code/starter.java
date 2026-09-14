/*
 *	Author: Ren Bolen 
 *  Date: September 10, 2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner name = new Scanner(System.in);
		Scanner month = new Scanner(System.in);
		Scanner age = new Scanner(System.in);
		Scanner day = new Scanner(System.in);
		Scanner year = new Scanner(System.in);
		Scanner money = new Scanner(System.in);

		System.out.print("First Name: ");
		String text = name.nextLine();

		System.out.print("Age: ");
		int number = age.nextInt();

		System.out.print("Birthday Month: ");
		String brithmonth = month.nextLine();

		System.out.print("Birthday Day: ");
		int birthday = day.nextInt();	

		System.out.print("Birthday Year: ");
		int birthyear = year.nextInt();	

		System.out.print("How Much is a Buck Fifty: ");
		double buckfifty = money.nextDouble();	
	}
}
