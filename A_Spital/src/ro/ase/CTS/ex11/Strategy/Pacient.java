package ro.ase.CTS.ex11.Strategy;

public class Pacient {
	private String numePacient;
	private ModPlata modPlata;
	
	public void plateste(float suma) {
		modPlata.plateste(this.numePacient, suma);
	}

	public Pacient(String numePacient, ModPlata modPlata) {
		super();
		this.numePacient = numePacient;
		this.modPlata = modPlata;
	}

	public String getNumePacient() {
		return numePacient;
	}

	public void setNumePacient(String numePacient) {
		this.numePacient = numePacient;
	}

	public ModPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	

}
