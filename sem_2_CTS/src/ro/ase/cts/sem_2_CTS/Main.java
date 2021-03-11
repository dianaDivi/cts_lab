package ro.ase.cts.sem_2_CTS;

public class Main {

	public static void main(String[] args) {

		CurrentAccount c=new CurrentAccount();
		System.out.println(c.getBalance());
		
		CurrentAccount c1=new CurrentAccount(300, "A33s");
		CurrentAccount c2=new CurrentAccount(222, "A33s1");
		
		System.out.println(c1.getBalance());
		
		System.out.println("Creditul maxim pt un cont curent: "+ CurrentAccount.MAX_CREDIT);
		
		c1.deposit(300);
		System.out.println("Deposit : "+ c1.getBalance());
		
		try {
			c1.withdraw(100);
			c1.transfer(20, c1);
		} catch (InsufficientFundsException | IlegalTransferException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Withdraw: "+ c1.getBalance());
		System.out.println("Transfer: "+ + c1.getBalance());
	

		Bank banca=new Bank();
	
		BankAccount account4=banca.openBanckAccount(1);
		
	}

}
