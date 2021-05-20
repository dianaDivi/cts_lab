package ro.ase.CTS.ex11.Strategy;

public class PersoanaJuridica implements IProcesareDocumente{

	@Override
	public void procesareDocumente(String numePersoana) {
		System.out.println("Este o persoana Juridica, se solicita actele de infiintare a firmei si dovada inregistrarii");
	}

}
