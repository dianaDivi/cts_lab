package ro.ase.CTS_clase;

public class AgentieSaticBlock {
	private String nume;
	private float capital;
	private int nrAngajati;
	
	
		
	private AgentieSaticBlock() {
		this.nume="Agentie Static Block";
		this.capital=33f;
		this.nrAngajati=30;
	}
	
	private static AgentieSaticBlock instanta=null;
	
	//aici se face o verificare ca este initializat constructorul
	static {
		try {
			instanta=new AgentieSaticBlock();
		} catch (Exception e) {
			System.out.println("Constructorul nu a fost initializat");
		}
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

	public static AgentieSaticBlock getInstanta() {
		return instanta;
	}

	public static void setInstanta(AgentieSaticBlock instanta) {
		AgentieSaticBlock.instanta = instanta;
	}

	@Override
	public String toString() {
		return "AgentieSaticBlock [nume=" + nume + ", capital=" + capital + ", nrAngajati=" + nrAngajati + "]";
	}
	
	

}
