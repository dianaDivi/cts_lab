package ro.ase.CTS.ex13.State;

public class NuAreBani implements State {

	@Override
	public void doAction(RetragereDeLaBancomat retragereDeLaBancomat) {
		System.out.println("Comanda neefectuara, fara PIN");
		retragereDeLaBancomat.setState(this);
	}

}
