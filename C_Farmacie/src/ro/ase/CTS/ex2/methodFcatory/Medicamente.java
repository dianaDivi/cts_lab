package ro.ase.CTS.ex2.methodFcatory;

public abstract class Medicamente {
	private String nume;
	private float pret;
	public Medicamente(String nume, float pret) {
		super();
		this.nume = nume;
		this.pret = pret;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public float getPret() {
		return pret;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}
	
	

}
