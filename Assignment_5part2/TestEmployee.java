package Assignment_5part2;

import java.util.Scanner;

public class TestEmployee extends NormalEmployee{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice;
		do
		{
			System.out.println("Choose Employment Type: ");
			System.out.println("1. Normal Employee");
			System.out.println("2. Bonus Employee");
			choice = scan.nextInt();
		}while(choice > 3 || choice < 1);
		
		
		Employee e1;
		if(choice == 1)
		{
			e1 = new NormalEmployee();
		}
		else
		{
			e1 = new BonusEmployee();
		}
			
		
		System.out.print("Name: ");
		e1.setName(scan.next());
		
		System.out.print("Address: ");
		e1.setAddress(scan.next());
		
		System.out.print("Designation: ");
		e1.setDesignation(scan.next());
		
		System.out.print("Department: ");
		e1.setDepartment(scan.next());
		
		System.out.print("Bank Name: ");
		e1.setBankName(scan.next());
		
		System.out.print("Bank A/C No.: ");
		e1.setAccountNum(scan.nextLong());
		
		System.out.print("DOJ: ");
		e1.setDOJ(scan.next());
		
		System.out.print("UAN");
		e1.setUAN(scan.nextLong());
		
		System.out.print("PF No: ");
		e1.setPFNo(scan.nextLong());
		
		System.out.print("ESI No: ");
		e1.setESINo(scan.nextLong());
		
		System.out.print("Gross Wage : "); 
		e1.setGrossWage(scan.nextDouble());
		
		if (choice == 1)
		{
			System.out.print("Working Days : ");
			e1.setWorkingDays(scan.nextInt());
			
			System.out.print("Leaves Taken : ");
			e1.setLeavesTaken(scan.nextInt());
			
			System.out.print("LOP : ");
			e1.setLOP(scan.nextInt());
		}
		
		System.out.println("Net Salary            | "+e1.theMonthly());
		System.out.println("------------------------------------");
		
	}
	
}