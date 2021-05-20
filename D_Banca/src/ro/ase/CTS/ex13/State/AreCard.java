package ro.ase.CTS.ex13.State;

public class AreCard implements State{

	@Override
	public void doAction(RetragereDeLaBancomat retragereDeLaBancomat) {
		System.out.println("Retragere in proces, clientul are card");
		retragereDeLaBancomat.setState(this);
		
		
	}

}
