package ro.ase.CTS.ex13.State;

public class RetragereDeLaBancomat {
	private State state;
	private float sold;
	
	public RetragereDeLaBancomat(float sold) {
		super();
		this.state = new AreCard();
		this.sold = sold ;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}
	
	
	
}
