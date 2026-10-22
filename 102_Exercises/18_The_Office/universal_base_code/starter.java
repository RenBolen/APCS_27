/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee DwightS = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee JimH = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee PamB = new Employee(2011, "Pam", "Beesley", 2250.0);
		Employee JustinP = new Employee(9999, "Justin", "Pyo", 0.01);

		DwightS.raiseSalary(100);
		JimH.raiseSalary(100);
		PamB.raiseSalary(100);
		JustinP.raiseSalary(-99);

		System.out.println("=======================");
		System.out.println(DwightS.getFirstName() + " " + DwightS.getLastName());
		System.out.println("=======================");
		System.out.println("Salary: $" + DwightS.getSalary());
		System.out.println("Annual Salary: $" + DwightS.getAnnualSalary());
		System.out.println("");
		System.out.println("=======================");
		System.out.println(JimH.getFirstName() + " " + JimH.getLastName());
		System.out.println("=======================");
		System.out.println("Salary: $" + JimH.getSalary());
		System.out.println("Annual Salary: $" + JimH.getAnnualSalary());
		System.out.println("");
		System.out.println("=======================");
		System.out.println(PamB.getFirstName() + " " + PamB.getLastName());
		System.out.println("=======================");
		System.out.println("Salary: $" + PamB.getSalary());
		System.out.println("Annual Salary: $" + PamB.getAnnualSalary());
		System.out.println("");
		System.out.println("=======================");
		System.out.println(JustinP.getFirstName() + " " + JustinP.getLastName());
		System.out.println("=======================");
		System.out.println("Salary: $" + JustinP.getSalary());
		System.out.println("Annual Salary: $" + JustinP.getAnnualSalary());
		System.out.println("");

		
	}
}
