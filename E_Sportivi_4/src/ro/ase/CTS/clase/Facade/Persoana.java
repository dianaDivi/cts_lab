package ro.ase.CTS.clase.Facade;

public class Persoana {
	private String nume;
	private String CNP;
	
	
	public Persoana(String nume, String cNP) {
		super();
		this.nume = nume;
		CNP = cNP;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getCNP() {
		return CNP;
	}
	public void setCNP(String cNP) {
		CNP = cNP;
	}
	
	
}
