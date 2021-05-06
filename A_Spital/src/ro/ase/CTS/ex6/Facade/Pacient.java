package ro.ase.CTS.ex6.Facade;

public class Pacient {
	private int codPacient;
	private String numePacient;
	
	public Pacient() {
		this.codPacient=2;
		this.numePacient="Mihail";
	}
	
	public String getNumePacient() {
		return numePacient;
	}
	public void setNumePacient(String numePacient) {
		this.numePacient = numePacient;
	}
	public int getCodPacient() {
		return codPacient;
	}
	public void setCodPacient(int codPacient) {
		this.codPacient = codPacient;
	}
	
	
}
