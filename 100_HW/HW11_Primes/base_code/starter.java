/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime (int num) {
		int originalNum = num;
		num--;
		while (num > 1) {
			if (originalNum % num == 0) {
				return false;
			}
			num--;
		}
		return true;
	}
	public static void printPrimes (int num) {
		int originalNum = num;
		int primeTest = 2;
		int divisor;
		boolean isPrime = true;
		while (originalNum > primeTest) {
			divisor = primeTest;
			while (divisor >= 2) {
				divisor--;
				if (primeTest % divisor == 0 && divisor != 1) {
					isPrime = false;
				}
				if (divisor == 1 && isPrime == true) {
					System.out.println(primeTest);
				}
			}
			primeTest++;
			isPrime = true;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Choose an int: ");
		int num = sc.nextInt();
		if (checkPrime(num)) {
			System.out.println(num + " was a prime number!");
		}
		else {
			System.out.println(num + " was not a prime number!");
		}
		System.out.println("All Lower Prime Numbers");
		System.out.println("=======================");
		printPrimes(num);
	}
}
