/*Christopher John */
/*ATM Login and Account Management */
/* This file is used to allow users to use an ATM application. Users will enter their
 * customer number, pin number to access the system. They can then
 * access a number of options to check their balances in different accounts.*/
package atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ATMAccount {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int CustomerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	public int setCustomerNumber(int customerNumber) {
		this.CustomerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	
	
	/*calcCheckingWithdrawal uses the checkingBalance field.
	  calcSavingDeposit uses the savingBalance field */
	
	public double checkingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double savingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double checkingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double savingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	
	
	
	
	
	
	
	public void getCheckingWithdrawInput() {
		System.out.println("Your balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Enter withdrawal amount: ");
		double amount = input.nextDouble();

		if ((checkingBalance - amount) >= 0) {
			checkingWithdraw(amount);
			System.out.println("Updated Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
		} else {
			System.out.println("Error." + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Your Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Enter withdrawal amount: ");
		double amount = input.nextDouble();

		if ((savingBalance - amount) >= 0) {
			savingWithdraw(amount);
			System.out.println("Updated Saving Account balance: " + savingBalance + "\n");
		} else {
			System.out.println("Error." + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Your Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Enter deposit amount: ");
		double amount = input.nextDouble();

		if ((checkingBalance + amount) >= 0) {
			checkingDeposit(amount);
			System.out.println("Updated Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
		} else {
			System.out.println("Error." + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Your Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Enter deposit amount: ");
		double amount = input.nextDouble();

		if ((savingBalance + amount) >= 0) {
			savingDeposit(amount);
			System.out.println("Updated Saving Account balance: " + moneyFormat.format(savingBalance) + "\n");
		} else {
			System.out.println("Error." + "\n");
		}
	}
	
	
}
	
	
