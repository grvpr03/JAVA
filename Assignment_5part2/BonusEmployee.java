package Assignment_5part2;

import java.util.Scanner;

public class BonusEmployee extends Employee {


	@Override
	public double theMonthly() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Bonus (in percentage) : ");
		double bonus = scan.nextDouble(); 
		
		double bonus_percent = bonus / 100;
		
		setNetSalary(getGrossWage()+(getGrossWage()*bonus_percent));
		System.out.println("\n----------Bonus Employee------------");
		System.out.println("Gross Salary          | "+getGrossWage());
		System.out.println("Bonus                 | "+bonus+"%");
		System.out.println("------------------------------------");
		return getNetSalary();
	}

}