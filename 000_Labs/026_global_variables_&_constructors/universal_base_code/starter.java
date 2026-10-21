/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount bank1 = new BankAccount();
		BankAccount bank2 = new BankAccount("Bob");
		BankAccount bank3 = new BankAccount("Robert", 100.0);
		BankAccount bank4 = new BankAccount("Bobby", 10.0);

		bank1.accountInfo();
		bank2.accountInfo();
		bank3.accountInfo();
		bank4.accountInfo();
	}
}
