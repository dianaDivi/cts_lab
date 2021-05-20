package ro.ase.CTS.ex11.Strategy;

public class Main {

	public static void main(String[] args) {

		Persoana persoana=new Persoana("Diana", new PersoanaFizica());
		persoana.procesareDocumente();
		
		Persoana persoana1=new Persoana("Diana", new PersoanaJuridica());
		persoana1.procesareDocumente();
		
	}

}
