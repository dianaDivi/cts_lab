package ro.ase.CTS.Command;

public class PachetCazare implements PachetTuristic{
	private int codPachetTuristic;
	
	
	public PachetCazare(int codPachetTuristic) {
		super();
		this.codPachetTuristic = codPachetTuristic;
	}

	public int getCodPachetTuristic() {
		return codPachetTuristic;
	}

	public void setCodPachetTuristic(int codPachetTuristic) {
		this.codPachetTuristic = codPachetTuristic;
	}

	@Override
	public void vanzare() {
		System.out.println("Pachet Cazare Vanzare");
		
	}

	@Override
	public void rezervare() {
		System.out.println("Pachet Cazare Rezervare");
		
	}
	
	

}
