package ro.ase.CTS.clase.Facade;

public class Bilet {
	private String numeBilet;
	private int nrLoc;
	public Bilet(String numeBilet, int nrLoc) {
		super();
		this.numeBilet = numeBilet;
		this.nrLoc = nrLoc;
	}
	public String getNumeBilet() {
		return numeBilet;
	}
	public int getNrLoc() {
		return nrLoc;
	}
	
	
}
