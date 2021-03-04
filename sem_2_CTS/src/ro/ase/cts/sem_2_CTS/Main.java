package ro.ase.cts.sem_2_CTS;

public class Main {

	public static void main(String[] args) {

		CurrentAccount c=new CurrentAccount();
		System.out.println(c.getBalance());
		//CurrentAccount c1=new CurrentAccount(199, "A33s");
		//System.out.println(c1.getBalance());
		
		System.out.println("Creditul maxim pt un cont curent: "+ CurrentAccount.MAX_CREDIT);
		
	}

}
