package ro.ase.CTS.ex13.Command;

public class CommandConstituire extends Command{

	public CommandConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

	@Override
	public void executa() {
		super.getContBancar().constituire(super.getSuma());
		
	}

}
