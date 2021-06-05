package ro.ase.cts.sem_2_CTS;

public interface Withdrawable {
	public void withdraw(double amount) throws InsufficientFundsException;
}
