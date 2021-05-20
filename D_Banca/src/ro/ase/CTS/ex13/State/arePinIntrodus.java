package ro.ase.CTS.ex13.State;

public class arePinIntrodus  implements State{

	@Override
	public void doAction(RetragereDeLaBancomat retragereDeLaBancomat) {
		System.out.println("Tranzactie efectuara, confirmata prin PIN");
		retragereDeLaBancomat.setState(this);
	}

}
