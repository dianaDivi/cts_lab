package ro.ase.CTS.Flyweight;

public class Optionale {
	private boolean cina;
	private int nrExcursii;
	
	public Optionale(boolean cina, int nrExcursii) {
		super();
		this.cina = cina;
		this.nrExcursii = nrExcursii;
	}

	public Optionale() {
		this.cina = false;
		this.nrExcursii = 3;
	}

	
	@Override
	public String toString() {
		return "Optionale [cina=" + cina + ", nrExcursii=" + nrExcursii + "]";
	}
	
	

}
