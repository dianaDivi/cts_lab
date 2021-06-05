package ro.ase.cts.sem_2_CTS;

public interface Transferable {
	ublic void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException;
}
