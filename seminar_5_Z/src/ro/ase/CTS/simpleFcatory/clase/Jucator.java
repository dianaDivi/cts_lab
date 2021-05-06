package ro.ase.CTS.simpleFcatory.clase;

public abstract class Jucator {

	private String nume;
	
	
	
	public Jucator(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}


}
