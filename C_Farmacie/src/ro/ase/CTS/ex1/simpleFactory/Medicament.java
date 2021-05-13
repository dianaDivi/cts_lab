package ro.ase.CTS.ex1.simpleFactory;

public abstract class Medicament {
	private String denumire;
	private float pret;
	
	public Medicament(String denumire, float pret) {
		super();
		this.denumire = denumire;
		this.pret = pret;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}
		
}
