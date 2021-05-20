package ro.ase.CTS.ex15.Command_Z;

public class CommandDepunere extends Command{

	public CommandDepunere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getContBancar().depunere(super.getSuma());
		
	}

}
