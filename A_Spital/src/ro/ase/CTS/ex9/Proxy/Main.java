package ro.ase.CTS.ex9.Proxy;

public class Main {

	public static void main(String[] args) {
		OperatorRezervare operatorRezervare=new OperatorRezervare("Victor");
		operatorRezervare.afisareAsigurare(true);
		
		Proxy proxy=new Proxy(operatorRezervare);
		proxy.afisareAsigurare(false);

	}

}
