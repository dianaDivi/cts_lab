package ro.ase.CTS.ex12.Observer;

public class Main {

	public static void main(String[] args) {

		ClientAbonat clientAbonat=new ClientAbonat("Diana");
		ClientAbonat clientAbonat2=new ClientAbonat("Claw");
		ClientAbonat clientAbonat3=new ClientAbonat("Victor");
		
		Banca banca=new Banca("Dugan");
		banca.adaugaObserver(clientAbonat);
		banca.adaugaObserver(clientAbonat2);
		banca.adaugaObserver(clientAbonat3);
		
		banca.notificaOfertaNoua();
		


	}

}
