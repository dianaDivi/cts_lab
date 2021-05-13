package ro.ase.CTS.Command;

public class CommandRezervare implements Command{
	private PachetTuristic pachetTuristic;
	
	
	
	public CommandRezervare(PachetTuristic pachetTuristic) {
		super();
		this.pachetTuristic = pachetTuristic;
	}



	public PachetTuristic getPachetTuristic() {
		return pachetTuristic;
	}



	public void setPachetTuristic(PachetTuristic pachetTuristic) {
		this.pachetTuristic = pachetTuristic;
	}



	@Override
	public void executa() {
		pachetTuristic.rezervare();
		
	}

}
