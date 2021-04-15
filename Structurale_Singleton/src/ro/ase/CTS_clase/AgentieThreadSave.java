package ro.ase.CTS_clase;

public class AgentieThreadSave {
	private String nume;
	private float capital;
	private int nrAngajati;
	
	private static AgentieThreadSave instanta=null;

	private AgentieThreadSave(String nume, float capital, int nrAngajati) {
		super();
		this.nume = nume;
		this.capital = capital;
		this.nrAngajati = nrAngajati;
	}
	
	public static synchronized AgentieThreadSave getInstanta(String nume, float capital, int nrAngajati) {
		if(instanta==null) {
			instanta=new AgentieThreadSave(nume, capital, nrAngajati);
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



	@Override
	public String toString() {
		return "AgentieThreadSave [nume=" + nume + ", capital=" + capital + ", nrAngajati=" + nrAngajati + "]";
	}
	
	
	
	

}
