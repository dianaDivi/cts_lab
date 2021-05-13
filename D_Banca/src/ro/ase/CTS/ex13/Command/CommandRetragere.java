package ro.ase.CTS.ex13.Command;

public class CommandRetragere extends Command{

	public CommandRetragere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getContBancar().retragere(super.getSuma());
		
	}

}
