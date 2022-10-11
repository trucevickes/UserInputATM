/* Christopher John */
/* ATM Account Options */
/* This file will structure the code that prompts users to enter in information
 * based on the type of account they choose to check the balance for or deposit/withdraw from. */
package atm;


import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

public class ATMOptions extends ATMAccount{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat();
	private int selection;
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x = 1;
		// TODO Auto-generated method stub
		
		
		do {
			try {
				data.put(123456789, 1234);
				data.put(123456780, 1230);
				
				System.out.println("Thank you for using ATM ATM.");

				System.out.print("Enter Your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());

				System.out.print("Enter Your Pin Number: ");
				setPinNumber(menuInput.nextInt());
				
			}
			
			catch (Exception e) {
				System.out.println("\n" + "Please enter a numerical value." + "\n");
				x = 2;
			}
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
	
		} while (x == 1);
   }
	
	
	public void getAccountType() {
		System.out.println("Select account type: ");
		System.out.println("1 - Checking Account");
		System.out.println("2 - Saving Account");
		System.out.println("3 - Exit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getCheckingBalance();
			break;

		case 2:
			getSavingBalance();
			break;

		case 3:
			System.out.println("Thank You and have a great day.");
			break;

		default:
			System.out.println("\n" + "Error." + "\n");
			getAccountType();
		}
	}
	
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("1 - View Balance");
		System.out.println("2 - Withdraw Funds");
		System.out.println("3 - Deposit Funds");
		System.out.println("4 - Exit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Account Balance: " + moneyFormat.format(getCheckingBalance()) + "\n");
			getAccountType();
			break;

		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You and have a great day.");
			break;

		default:
			System.out.println("\n" + "Error." + "\n");
			getChecking();
		}
	}
	
	public void getSaving() {
		System.out.println("Savings Account: ");
		System.out.println("1 - View Balance");
		System.out.println("2 - Withdraw Funds");
		System.out.println("3 - Deposit Funds");
		System.out.println("4 - Exit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Account Balance: " + moneyFormat.format(getSavingBalance()) + "\n");
			getAccountType();
			break;

		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You and have a great day.");
			break;

		default:
			System.out.println("\n" + "Error." + "\n");
			getSaving();
		}
	}

	
	
}
