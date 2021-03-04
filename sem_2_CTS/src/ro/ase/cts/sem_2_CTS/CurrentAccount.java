package ro.ase.cts.sem_2_CTS;

public class CurrentAccount extends BankAccount{
	public static double MAX_CREDIT=5000;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {

		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(this.balance>= amount) {
			this.balance -= amount;
		}else {
			throw new InsufficientFundsException("fonduri insuficiente");
		}
		
		
	}

	@Override
	public void transfer(double amount, Account destination) throws IlegalTransferException, InsufficientFundsException {
		
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IlegalTransferException("conturilecoincid");
		}else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
		
	}

	
	
}
