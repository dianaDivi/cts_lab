package ro.ase.CTS_clase;

public class AgentieLazyInitialization {

	private String nume;
	private float capital;
	private int nrAngajati;
	
	private static AgentieLazyInitialization instanta=null;

	private AgentieLazyInitialization(String nume, float capital, int nrAngajati) {
		this.nume = nume;
		this.capital = capital;
		this.nrAngajati = nrAngajati;
	}
	
	
	public static AgentieLazyInitialization getAgentie(String nume, float capital,int nrAngajati) {
		if(instanta==null) {
			instanta=new AgentieLazyInitialization( nume, capital, nrAngajati);
		}
		
		return instanta;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public float getCapital() {
		return capital;
	}


	public void setCapital(float capital) {
		this.capital = capital;
	}


	public int getNrAngajati() {
		return nrAngajati;
	}


	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}


	public static AgentieLazyInitialization getInstanta() {
		return instanta;
	}


	public static void setInstanta(AgentieLazyInitialization instanta) {
		AgentieLazyInitialization.instanta = instanta;
	}


	@Override
	public String toString() {
		return "AgentieLazyInitialization [nume=" + nume + ", capital=" + capital + ", nrAngajati=" + nrAngajati + "]";
	}
	
	
}
