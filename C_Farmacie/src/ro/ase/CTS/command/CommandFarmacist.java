package ro.ase.CTS.command;

public class CommandFarmacist extends Command{
	public CommandFarmacist(int codComanda) {
		super(codComanda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
	System.out.println("Comanda"+ super.getCodComanda()+" este preluata de catre Farmacist");
	}
}
