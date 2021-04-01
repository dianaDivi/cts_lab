package ro.ase.CTS.clase;

public class Dedicare {

	private String nume_persoana;
	private int numar_participanti;
	private float investitie_aniversare;
	
	private static Dedicare instantaDedicare=null;
	
	//functie
	public static synchronized Dedicare getInstantaDedicare(String nume_persoana, int numar_participanti, float investitie_aniversare) {
		if(instantaDedicare==null) {
			instantaDedicare=new Dedicare(nume_persoana, numar_participanti, investitie_aniversare);
		}
		return instantaDedicare;
	}
	
	public Dedicare(String nume_persoana, int numar_participanti, float investitie_aniversare) {
		super();
		this.nume_persoana = nume_persoana;
		this.numar_participanti = numar_participanti;
		this.investitie_aniversare = investitie_aniversare;
	}
	
	public void setNume_persoana(String nume_persoana) {
		this.nume_persoana = nume_persoana;
	}
	
	public void setNumar_participanti(int numar_participanti) {
		this.numar_participanti = numar_participanti;
	}
	
	public void setInvestitie_aniversare(float investitie_aniversare) {
		this.investitie_aniversare = investitie_aniversare;
	}
	
	@Override
	public String toString() {
		return "Dedicare [nume_persoana=" + nume_persoana + ", numar_participanti=" + numar_participanti
				+ ", investitie_aniversare=" + investitie_aniversare + "]";
	}
	
	

}
