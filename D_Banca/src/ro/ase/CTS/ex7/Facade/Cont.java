package ro.ase.CTS.ex7.Facade;

public class Cont {
	private String numePersoana;
	private String IBAN;
	public Cont(String numePersoana, String iBAN) {
		super();
		this.numePersoana = numePersoana;
		IBAN = iBAN;
	}
	public String getNumePersoana() {
		return numePersoana;
	}
	public void setNumePersoana(String numePersoana) {
		this.numePersoana = numePersoana;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	@Override
	public String toString() {
		return "Cont [numePersoana=" + numePersoana + ", IBAN=" + IBAN + "]";
	}
	
	
	
}
