package ro.ase.cts.sem_2_CTS;

public class SavingAccount extends BankAccount {
	

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(double balance, String iban) {
		super(balance, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		this.balance+=amount;
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount<=this.balance) {
			this.balance-=amount;
		}
		
		
	}

	@Override
	public void transfer(double amount, Account destinationq)
			throws IlegalTransferException, InsufficientFundsException {
		
		
	}

}
