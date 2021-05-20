package ro.ase.CTS.ex3.Builder;

public class Main {

	public static void main(String[] args) {
		Cont cont=new ContBuilderConcret().build();
		System.out.println(cont);
		Cont cont1=new ContBuilderConcret().setCard(true).setInternetBanking(true).build();
		System.out.println(cont1);

	}

}
