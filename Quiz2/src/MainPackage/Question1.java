/*
 * public static void main method: method to loop for calculations
 * tution by credit method: calulate base tuition for 1 semester
 * percent increase method: 3.2% increase per year
 * student loan method: amount borrowed per semester
 * repayment method: if paying $150/month, determine how long it would take to repay student loans
 */

package MainPackage;
import java.util.Scanner;

public class Question1 {
	private static Scanner kb;
	
	public static void main(String[] args){
		System.out.print("Enter annual interest rate for loan: ");
		double interestRate = kb.nextDouble();
		
		System.out.print("Enter number of years: ");
		int years = kb.nextInt();
		
		System.out.print("Enter loan amount: ");
		double loanAmount = kb.nextDouble();
		
		//Create loan object
		Loan loan = new Loan(interestRate, years, loanAmount);
		
		System.out.printf("The loan was instated on %s\n" + 
		"the monthly payment is %.2f\nThe totalpayment is %.2f\n",
		loan.getDateOfLoan().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	}
}
