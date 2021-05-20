package ro.ase.CTS.ex13.State;

 class Masa {
	private int nrMasa;
	private Stare stare;
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare=new StareLibera();
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	
	
	public Stare getStare() {
		return stare;
	}
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	void rezervaMasa() {
		StareRezervare rezervare=new StareRezervare();
		rezervare.schimbaStare(this);
	}
	
	public void ocupaMasa() {
		StareOcupata ocupata=new StareOcupata();
		ocupata.schimbaStare(this);
	}
	
	public void eliberareMasa() {
		StareLibera libera=new StareLibera();
		libera.schimbaStare(this);
		
	}
	
	
}
