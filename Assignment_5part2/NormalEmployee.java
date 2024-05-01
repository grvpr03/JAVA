package Assignment_5part2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NormalEmployee extends Employee {

	@Override
	public double theMonthly() {
		// Paid Days
		setPaidDays(getWorkingDays() - getLOP());
		
		//Basic Wage 
		setBasicWage((getGrossWage() / getWorkingDays()) * getPaidDays() * 0.45);
		
		//EPF
		if (getBasicWage() >= 15000)
			setEpf(15000 * 0.12);
		else
			setEpf(getBasicWage() * 0.15);
		
		// HRA
		setHra(getBasicWage() * 0.4);
		
		// Allowances
		double conveyance = (1600.00 / getWorkingDays())*getPaidDays();
		BigDecimal bd = new BigDecimal(conveyance).setScale(0, RoundingMode.HALF_UP);  
		conveyance = bd.doubleValue();
		setConveyanceAllowance(conveyance);
		
		double medical = (1250.00 / getWorkingDays()) * getPaidDays();
		bd = new BigDecimal(medical).setScale(0, RoundingMode.HALF_UP); 
		medical = bd.doubleValue();
		setMedicalAllowance(medical);
		
		setOtherAllowances((getGrossWage() / getWorkingDays()) * getPaidDays()
				- (getBasicWage() + getHra() + getConveyanceAllowance() + getMedicalAllowance()));
		
		// Total Earnings
		double earnings = getBasicWage() + getHra() + getConveyanceAllowance() + getMedicalAllowance() + getOtherAllowances();
		bd = new BigDecimal(earnings).setScale(0, RoundingMode.HALF_UP);
		earnings = bd.doubleValue();
		setTotalEarnings(earnings);

		// Health Insurance
		if (getGrossWage() <= 21000)
			setHealthInsurance(getTotalEarnings() * 0.0075);
		else
			setHealthInsurance(0);

		// Professional Tax
		setProfessionalTax(0);
		
		// Loan Recovery
		setLoanRecovery(0);
		
		double deductions = getEpf() + getHealthInsurance() + getProfessionalTax() + getLoanRecovery(); 
		bd = new BigDecimal(deductions).setScale(0, RoundingMode.HALF_UP);
		deductions = bd.doubleValue();
		setTotalDeductions(deductions);

		setNetSalary(getTotalEarnings() - getTotalDeductions());
		
		System.out.println("\n-----------Earnings---------------");
		System.out.println("Basic Wage            |"+getBasicWage());
		System.out.println("HRA                   | "+getHra());
		System.out.println("Converyance Allowance | "+getConveyanceAllowance());
		System.out.println("Medical Allowance     | "+getMedicalAllowance());
		System.out.println("Other Allowance       | "+getOtherAllowances());
		System.out.println("\nTotal Earnings      | "+getTotalEarnings());	
		
		System.out.println("\n----------Deductions--------------");
		System.out.println("EPF                   | "+getEpf());
		System.out.println("Health Insurance      | "+getHealthInsurance());
		System.out.println("Professional Tax      | "+getProfessionalTax());
		System.out.println("Loan Recovery         | "+getLoanRecovery());
		System.out.println("\nTotal Deductions    | "+getTotalDeductions());
		System.out.println("------------------------------------");
		
		
		
		
		return getNetSalary();
	}

}