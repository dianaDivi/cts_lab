package ro.ase.CTS.ex8.Proxy;

public class Main {

	public static void main(String[] args) {
		Cont cont=new Cont("Lei");
		cont.afisareMetodaPlata("Euro");
		
		Proxy proxy=new Proxy(cont);
		proxy.afisareMetodaPlata("RON");
		
		proxy.afisareMetodaPlata("Euro");
		
	}

}
