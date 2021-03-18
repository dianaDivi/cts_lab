package ro.ase.cts.sem_2_CTS;

public class CreditAccount  extends BankAccount{

	@Override
	public void deposit() {
		if(amount > 0) {
			this.balance+=amount;
		}
		
	}

	@Override
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance-=amount;
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double amount, Account destinationq)
			throws IlegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}
	

}
