package ro.ase.CTS.ex13.State;

public class Pacient {
	private String numePacient;
	private Stare stare;
	
	
	public Pacient(String numePacient) {
		super();
		this.numePacient = numePacient;
		this.stare = new StareExternat();
	}
	public String getNumePacient() {
		return numePacient;
	}
	public void setNumePacient(String numePacient) {
		this.numePacient = numePacient;
	}
	public Stare getStare() {
		return stare;
	}
	void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void externat() {
		StareExternat externat=new StareExternat();
		externat.stabilireStarePacient(this);
	}
	
	public void internat() {
		StareInternat internat=new StareInternat();
		internat.stabilireStarePacient(this);
	}
	
	public void SubObservatie() {
		StareSubObservatie observatie=new StareSubObservatie();
		observatie.stabilireStarePacient(this);
	}

}
