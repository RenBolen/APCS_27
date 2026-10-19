/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
	private int accountNum;
	private double balance;
	private boolean isActive;

	// -------CONSTRUCTORS-------
	private int accountNum() {
		int randomNum = (int) (Math.random() * 50 + 50);
		return randomNum; 
	}
	private void bankAccount() {
		owner = "Unknown";
		balance = 0;
		isActive = true;
		accountNum++;
	}
	private void makeOwner() {

	}

	// -------METHODS-------

}