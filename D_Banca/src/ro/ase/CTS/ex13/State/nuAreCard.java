package ro.ase.CTS.ex13.State;

public class nuAreCard implements State{

	@Override
	public void doAction(RetragereDeLaBancomat retragereDeLaBancomat) {
		System.out.println("Comanda neefectuata: Nu are card");
		retragereDeLaBancomat.setState(this);
	}

}
