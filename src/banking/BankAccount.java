package banking;
/**
 * A bank account with a balance.
 */
public class BankAccount {
	private Long accountNumber;
	private String accountName;
	
	public BankAccount(String name) {
		this.accountName = name;
		accountNumber = Bank.getNextAccountNumber();
	}
	
	
	public BankAccount(String name, Long acctNumber) {
		//TODO complete this
	}
	
	public void deposit(double amount) {
		//TODO
	}
	
	public boolean withdraw(double amount) {
		//TODO
	}
	
	//TODO Also write these methods:
	// toString()
	// getAccountNumber()
	// getBalance()
	// getName()
	// setName(String)
	
}
