package Assignment_5part2;

public abstract class Employee {

	private String name, address, designation, department, bankName, DOJ;
	private int LOP, workingDays, empID, leavesTaken;
	private long accountNum, UAN, PFNo, ESINo; 
	private double grossWage, paidDays, basicWage, epf, hra, healthInsurance, conveyanceAllowance, professionalTax, 
	medicalAllowance, loanRecovery, otherAllowances, totalEarnings, totalDeductions, netSalary;
	
	public abstract double theMonthly();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getDOJ() {
		return DOJ;
	}


	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}


	public int getLOP() {
		return LOP;
	}


	public void setLOP(int lOP) {
		LOP = lOP;
	}


	public int getWorkingDays() {
		return workingDays;
	}


	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public int getLeavesTaken() {
		return leavesTaken;
	}


	public void setLeavesTaken(int leavesTaken) {
		this.leavesTaken = leavesTaken;
	}


	public long getAccountNum() {
		return accountNum;
	}


	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}


	public long getUAN() {
		return UAN;
	}


	public void setUAN(long uAN) {
		UAN = uAN;
	}


	public long getPFNo() {
		return PFNo;
	}


	public void setPFNo(long pFNo) {
		PFNo = pFNo;
	}


	public long getESINo() {
		return ESINo;
	}


	public void setESINo(long eSINo) {
		ESINo = eSINo;
	}


	public double getGrossWage() {
		return grossWage;
	}


	public void setGrossWage(double grossWage) {
		this.grossWage = grossWage;
	}


	public double getPaidDays() {
		return paidDays;
	}


	public void setPaidDays(double paidDays) {
		this.paidDays = paidDays;
	}


	public double getBasicWage() {
		return basicWage;
	}


	public void setBasicWage(double basicWage) {
		this.basicWage = basicWage;
	}


	public double getEpf() {
		return epf;
	}


	public void setEpf(double epf) {
		this.epf = epf;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public double getHealthInsurance() {
		return healthInsurance;
	}


	public void setHealthInsurance(double healthInsurance) {
		this.healthInsurance = healthInsurance;
	}


	public double getConveyanceAllowance() {
		return conveyanceAllowance;
	}


	public void setConveyanceAllowance(double conveyanceAllowance) {
		this.conveyanceAllowance = conveyanceAllowance;
	}


	public double getProfessionalTax() {
		return professionalTax;
	}


	public void setProfessionalTax(double professionalTax) {
		this.professionalTax = professionalTax;
	}


	public double getMedicalAllowance() {
		return medicalAllowance;
	}


	public void setMedicalAllowance(double medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}


	public double getLoanRecovery() {
		return loanRecovery;
	}


	public void setLoanRecovery(double loanRecovery) {
		this.loanRecovery = loanRecovery;
	}


	public double getOtherAllowances() {
		return otherAllowances;
	}


	public void setOtherAllowances(double otherAllowances) {
		this.otherAllowances = otherAllowances;
	}


	public double getTotalEarnings() {
		return totalEarnings;
	}


	public void setTotalEarnings(double totalEarnings) {
		this.totalEarnings = totalEarnings;
	}


	public double getTotalDeductions() {
		return totalDeductions;
	}


	public void setTotalDeductions(double totalDeductions) {
		this.totalDeductions = totalDeductions;
	}


	public double getNetSalary() {
		return netSalary;
	}


	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
}