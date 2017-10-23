package banking;
import java.util.Scanner;

/**
 * Console dialog for deposit, withdraw, and displaying accounts.
 * 
 * @author your name
 */
public class BankApp {
	private static final Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		consoleDialog();
	}
	
	/**
	 * Console dialog lets user create account, deposit, withdraw,
	 * and print account info.
	 */
	public static void consoleDialog() {
		
		String prompt = "Input one of the following:\n"+
				"n              - (new) create a new bank account\n"+
				"d              - deposit to an account\n"+
				"w              - withdraw from an account\n"+
				"l              - list all accounts with balances\n"+
				"p acctNumber   - print info for one account (e.g. p 123456)\n"+
				"q              - quit\n"+
				"?              - print this menu again";
		
		String command = "?"; // most recent input command
		String arg = "";      // anything else on the input line
		do {
			switch(command) {
			case "n":
			case "new":
				createAccount();
				break;
			case "d":
			case "deposit":
				depositDialog();
				break;
			case "w":
			case "withdraw":
				withdrawDialog();
				break;
			case "l":
			case "list":
				// print list of all accounts with names and balances
				printReport();
				break;
			case "p":
			case "print":
				// next arg on line should be account number
				long acctNumber = 0;
				try {
					acctNumber = Long.parseLong(arg);
				} catch (NumberFormatException e) {
					System.out.println("Missing or invalid account number");
					break;
				}
				printAccountDetail(acctNumber);
				break;
			case "q":
			case "quit":
				System.out.println("Goodbye.");
				break;
			case "?":
			case "help":
				System.out.println(prompt);
				break;
			default:
				System.out.println("invalid input: "+command);
				System.out.println("Enter ? for help");
			}
			// get next user input
			System.out.print("Input: ");
			command = console.next();
			arg = console.nextLine(); // consume rest of input line
			
		} while (true);
	}


	/**
	 * Create a new account with balance 0.
	 * After creating account, the teller should use deposit
	 * to add funds.
	 */
	private static void createAccount() {
		System.out.println("Create a new account");
		String name = getReply("Enter account name: ");
		//TODO Create a new bank account
		BankAccount account = new BankAccount(name);
		//TODO Add account to the bank
		
		// Tell user what happened
		System.out.printf("Created new account no. %d, name \"%s\".%n", 
				account.getAccountNumber(), account.getName());
	}
	
	/**
	 * Dialog to deposit money to an account.
	 */
	private static void depositDialog() {
		// prompt the user for account number and amount to deposit
		Long accountNumber = getAccountNumber();
		// find the account
		BankAccount account = Bank.getAccount(accountNumber);
		if (account == null) {
			System.out.printf("Sorry, account number %d not found\n", accountNumber);
			return;
		}
		// Show account name, so we don't deposit to wrong account.
		System.out.printf("Acct no. %d: %s\n", account.getAccountNumber(), account.getName());
		
		double amount = getDoubleValue("Amount to deposit: ");
		// validate amount
		if (amount <= 0) {
			System.out.println("Sorry, amount must be positive.");
			return;
		}
		// make the deposit
		account.deposit( amount );
		// tell the user what happened
		System.out.printf("Deposited %,.2f Bt. Balance is %,.2f Bt\n",
				amount, account.getBalance() );
	}


	private static void withdrawDialog() {
		System.out.println("TODO write this method"); //TODO
		
	}
	
	/**
	 * Print information about one account.  Use the accountNumber
	 * to get BankAccount from the bank.
	 * @param acctNumber number of the account to display
	 */
	private static void printAccountDetail(long acctNumber) {
		System.out.println("TODO write this method"); //TODO
		
	}
	
	/**
	 * Print a nicely formatted list of all accounts.
	 * Print account number, account name, and balance.
	 * Get the list of accounts from the Bank.
	 */
	private static void printReport() {
		System.out.println("TODO write this method"); //TODO
	}
	
	/**
	 * Prompt user to enter a decimal number (double)
	 * and return it.
	 * @param prompt the prompt message to display
	 * @return value entered by user, as a double
	 */
	private static double getDoubleValue(String prompt) {
		while(true) {
			System.out.print(prompt);
			if (console.hasNextDouble()) return console.nextDouble();
			System.out.println("Please enter a number (double).");
			console.nextLine(); // discard the input
		}
	}

	/**
	 * Prompt user to enter a bank account number (long).
	 * In a real app, we would validate the account name, e.g.
	 * 10-digits long and has correct checksum.
	 * @return the account number
	 */
	private static long getAccountNumber( ) {
		final String prompt = "Please enter account number: ";
		while(true) {
			System.out.print(prompt);
			if (console.hasNextLong()) return console.nextLong();
			console.nextLine(); // discard the input
			System.out.print("Please enter account number (digits only): ");
		}
	}
	
	private static String getReply(String prompt) {
		System.out.print(prompt);
		return console.nextLine().trim();
	}
}
