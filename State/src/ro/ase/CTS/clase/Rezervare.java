package ro.ase.CTS.clase;

public class Rezervare {

	private Stare stare;
	private int id;
	
	
	public Rezervare( int id) {
		super();
		this.stare = null;
		this.id = id;
	}
	public Stare getStare() {
		return stare;
	}
	public void setStare(Stare stare) {
		this.stare = stare;
	}
	public int getId() {
		return id;
	}
	
	
}
