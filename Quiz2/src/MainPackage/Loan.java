package MainPackage;

public class Loan {
	private double annualInterestRate;
	private int years;
	private double loanAmount;
	private java.util.Date loanDate;
	
	//default loan constructor
	public Loan() {
		this(2.5, 1, 3500);
	}
	public Loan(double annualInterestRate, int years, double loanAmount){
		this.annualInterestRate = annualInterestRate;
		this.years = years;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	//return interest rate
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//set new interest rate
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	//return years
	public int getYears(){
		return years;
	}
	//set new number of years
	public void setYears(int years){
		this.years = years;
	}
	public double getloanAmount(){
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount){
		this.loanAmount = loanAmount;
	}
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate/12;
		double monthlyPayment = loanAmount*monthlyInterestRate/(1-(1/Math.pow(1 + monthlyInterestRate,years*12)));
		return monthlyPayment;
	}
	public double getTotalPayment(){
		double totalPayment = getMonthlyPayment()*years*12;
		return totalPayment;
	}
	public java.util.Date getDateOfLoan(){
		return loanDate;
	}
	
}
