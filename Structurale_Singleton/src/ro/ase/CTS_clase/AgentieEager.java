package ro.ase.CTS_clase;

public class AgentieEager {
	private String nume;
	private float capital;
	private int nrAngajati;
	
	
	private static final AgentieEager instanta=new AgentieEager();


	private AgentieEager() {
		
		this.nume = "Agentie Tur";
		this.capital = 0.3f;
		this.nrAngajati = 40;
	}


	@Override
	public String toString() {
		return "AgentieEager [nume=" + nume + ", capital=" + capital + ", nrAngajati=" + nrAngajati + "]";
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


	public static AgentieEager getInstanta() {
		return instanta;
	}
	
	

}
