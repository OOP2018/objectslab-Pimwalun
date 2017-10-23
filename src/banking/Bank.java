package banking;

import java.util.ArrayList;
import java.util.List;

/**
 * Bank maintains info about the accounts.
 * 
 * @author your name
 */
public class Bank {
	/** Next available account number. */
	private static long nextAccountNumber = 100L;  // for simplicity
	/** List of all the accounts at this bank. */
	private static List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	/**
	 * Get the next available bank account number, and increment it.
	 * 
	 * @return the next available account number for a new account.
	 */
	public static long getNextAccountNumber() {
		return nextAccountNumber++;
	}
	
	/**
	 * Add an account to the list of accounts,
	 * but only if it is not already in list.
	 * Check accounts be account number -- cannot add an
	 * account with same number as existing account.
	 * 
	 * @param account is the BankAccount to add
	 */
	public static void addAccount(BankAccount account) {
		//TODO complete this
	}

	/**
	 * Find and return a bank account by account number.
	 * @param acctNumber is the account number to fine
	 * @return BankAccount with requested account number, or null if not found.
	 */
	public static BankAccount getAccount(long acctNumber) {
		//TODO complete this - return a BankAccount that has matching accountNumber
		return null;
	}
	
	/**
	 * Get all the bank accounts.
	 * To prevent evil programmers from secretly adding or
	 * deleting bank accounts, we should really return 
	 * an unmodifiable view of the real BankAccounts list.
	 * Its a wrapper of the real list (not a copy) that
	 * prevents modification.
	 * If you want to try it, do this:
	 *   return java.util.Collections.unmodifiableList(accounts); 
	 * 
	 * 
	 * @return list of all the bank accounts
	 */
	public static List<BankAccount> getAccounts() {
		//TODO
		return null;
	}
}
