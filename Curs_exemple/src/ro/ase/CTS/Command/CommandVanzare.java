package ro.ase.CTS.Command;

public class CommandVanzare implements Command{
	PachetTuristic pachetTusistic;
	
	
	public CommandVanzare(PachetTuristic pachetTusistic) {
		super();
		this.pachetTusistic = pachetTusistic;
	}


	@Override
	public void executa() {
		pachetTusistic.vanzare();
		
	}

}
