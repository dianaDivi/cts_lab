package ro.ase.CTS.seminar11.state;

public class OpenState implements GateStateInterface{

	@Override
	public void enter(Gate gate) {
		System.out.println("Enter succesfully");
		gate.setState(new LockedState());
	}

	@Override
	public void authorize(Gate gate) {
		System.out.println("Already authorize user to pass");
	}

}
