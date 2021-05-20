package ro.ase.CTS.ex11.Strategy;

public class PersoanaFizica implements IProcesareDocumente {

	@Override
	public void procesareDocumente(String numePersoana) {
		System.out.println("Este o persoana Fizica, se solicita buletinul si adeerinta de la munca");
	}

}
