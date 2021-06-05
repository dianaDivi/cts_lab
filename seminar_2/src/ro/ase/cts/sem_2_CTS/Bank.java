package ro.ase.cts.sem_2_CTS;

public class Bank {
	public static int nextId;
	
	public BankAccount openBanckAccount(int tipCont) {
		if(tipCont==1) {
			return new CurrentAccount();
		}else if(tipCont==2) {
			return new SavingAccount();
		}else {
			throw new UnsupportedOperationException();
		}
	}

}
