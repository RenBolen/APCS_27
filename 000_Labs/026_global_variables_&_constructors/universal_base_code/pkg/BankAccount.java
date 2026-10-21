/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private static int nextAccountNumber = (int) (Math.random() * 951 + 50);

	private String owner;
	private int accountNum;
	private double balance;
	private boolean isActive;

	// -------CONSTRUCTORS-------
	public BankAccount() {
		owner = "Unknown";
		balance = 0.0;
		isActive = true;
		accountNum = nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String owner) {
		this.owner = owner;
		balance = 0.0;
		isActive = true;
		accountNum = nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String owner, double deposit) {
		this.owner = owner;
		balance = deposit;
		isActive = true;
		accountNum = nextAccountNumber;
		nextAccountNumber++;
	}

	// -------METHODS-------
	public void accountInfo() {
		System.out.println(owner + "'s Bank Account");
		System.out.println("Balance: " + balance);
		System.out.println("Active Status: " + isActive);
		System.out.println("Account Number: " + accountNum);
		System.out.println();
	}
}