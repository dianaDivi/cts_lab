package ro.ase.CTS.command;



public class CommandAjutorFarmacist  extends Command {

	public CommandAjutorFarmacist(int codComanda) {
		super(codComanda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
	System.out.println("Comanda"+ super.getCodComanda()+" este la asistent in pregatire");
	}

}
