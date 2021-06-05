package ro.ase.CTS.seminar11.state;

public class Gate {
	private GateStateInterface state;
	

	public Gate() {
		super();
		this.state = new LockedState();
	}

	public void setState(GateStateInterface state) {
		this.state = state;
	}
	
	public void enter(){
		System.out.println("Trying to enter the gate");
		state.enter(this);
	}
	
	public void authorize() {
		state.authorize(this);
		System.out.println("Trying to authenticate at the gate");

	}
	
}
