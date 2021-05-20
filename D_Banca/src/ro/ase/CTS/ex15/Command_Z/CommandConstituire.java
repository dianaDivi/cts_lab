package ro.ase.CTS.ex15.Command_Z;

public class CommandConstituire extends Command{

	public CommandConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

	@Override
	public void executa() {
		super.getContBancar().constituire(super.getSuma());
		
	}

}
