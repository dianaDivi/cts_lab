package ro.ase.CTS.Proxy;

import ro.ase.CTS.Adapter.PachetTuristic;

public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Diana", 3);
		Entitate entitate=new Entitate(persoana);
		entitate.rezervaPachet();
		
		Proxy proxy=new Proxy(entitate);
		proxy.rezervaPachet();

	}

}
