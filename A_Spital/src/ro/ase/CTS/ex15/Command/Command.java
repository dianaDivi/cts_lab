package ro.ase.CTS.ex15.Command;

public abstract class Command {
	private String numePacient;
	private String situatie;
	
	
	
	public Command(String numePacient, String situatie) {
		super();
		this.numePacient = numePacient;
		this.situatie = situatie;
	}



	public String getNumePacient() {
		return numePacient;
	}



	public void setNumePacient(String numePacient) {
		this.numePacient = numePacient;
	}



	public String getSituatie() {
		return situatie;
	}



	public void setSituatie(String situatie) {
		this.situatie = situatie;
	}



	public abstract void executa();

}
