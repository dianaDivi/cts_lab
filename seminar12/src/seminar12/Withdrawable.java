package seminar12;

public interface Withdrawable {
	public void withdraw(double amount) throws InsufficientFundsException;
}
