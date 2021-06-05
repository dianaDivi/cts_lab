package ro.ase.cts.sem_2_CTS;

public abstract class BankAccount extends Account{

	protected double balance;
	protected String iban;
	
	public BankAccount() {
		this.balance=0;
		this.iban="";
	}
	
	
	
	public BankAccount(double balance, String iban) {
	
		super();
		this.balance = balance;
		this.iban = iban;
	}



	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}


	
}
