package ro.ase.CTS.ex15.Command;

public abstract class Command {
	private int nrMasa;
	private String numePersoana;
	
	
	
	public Command(int nrMasa, String numePersoana) {
		super();
		this.nrMasa = nrMasa;
		this.numePersoana = numePersoana;
	}



	public int getNrMasa() {
		return nrMasa;
	}



	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}



	public String getNumePersoana() {
		return numePersoana;
	}



	public void setNumePersoana(String numePersoana) {
		this.numePersoana = numePersoana;
	}



	public abstract void execute();
}
