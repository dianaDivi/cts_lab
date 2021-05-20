package ro.ase.CTS.ex11.Strategy;

public class Persoana {
	private String nume;
	private IProcesareDocumente iProcesareDocumente;
	

	public void procesareDocumente() {
		iProcesareDocumente.procesareDocumente(this.nume);
	}
	
	public Persoana(String nume, IProcesareDocumente iProcesareDocumente) {
		super();
		this.nume = nume;
		this.iProcesareDocumente = iProcesareDocumente;
	}
	
	

}
