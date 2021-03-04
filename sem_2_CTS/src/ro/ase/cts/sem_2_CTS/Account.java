package ro.ase.cts.sem_2_CTS;

public abstract class Account {
	public abstract void deposit();
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount) throws InsufficientFundsException;
	public abstract void transfer(double amount, Account destinationq)throws IlegalTransferException, InsufficientFundsException;
	public abstract double getBalance();


}
