package banking;

import java.util.List;

/**
 * Test the methods of the Bank class.
 * Design your own tests
 */
public class BankTest {

	public static void main(String[] args) {
		testGetAccountNumber();
		testAddBankAccount();
	}

	public static void testGetAccountNumber() {
		long acctnum = Bank.getNextAccountNumber();
		long acctnum2  = Bank.getNextAccountNumber();
		System.out.println("first account number: "+acctnum);
		System.out.println("second account number:"+acctnum2);
		if (acctnum <= 0 || acctnum2 <= 0) System.out.println("Error: should be positive");
		if (acctnum2 != acctnum + 1L) System.out.println("Error: should increment by 1");
	}
	
	public static void testAddBankAccount() {
		BankAccount acct = new BankAccount("Bill Gates", 123456L);
		Bank.addAccount(acct);
		// test that the account was added by getting all accounts
		List<BankAccount> accts = Bank.getAccounts();
		if (accts == null) System.out.println("You didn't write Bank.getAccounts() yet.");
		if (accts.contains(acct)) System.out.println("Add account succeeded.");
		else System.out.println("Add account failed");
		
		//TODO you should test adding more accounts. Maybe it only works for 1 account.
		
		// Test add duplicate account
		System.out.println("add same account again");
		accts = Bank.getAccounts();
		int howMany = accts.size();
		Bank.addAccount(acct);
		if (Bank.getAccounts().size() == howMany) System.out.println("Looks ok (did not add account)");
		else System.out.println("Error: Bank accounts size changed (added duplicate?)");
	}
}
