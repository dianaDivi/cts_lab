package ro.ase.CTS.Adapter;

public class Main {

	public static void main(String[] args) {
		//Adaptor de Obiecte
		MasinaInchiriata inchiriata=new MasinaInchiriata(0, "Nume");
		PachetMasinaInchiriata pachetMasinaInchiriata=new PachetMasinaInchiriata(inchiriata);
		
		pachetMasinaInchiriata.descriere();
		
		
		//Adaptor de Clase
		PachetMasinaObiect masinaObiect=new PachetMasinaObiect(2, "Obiect");
		 masinaObiect.descriere();
	}

}
