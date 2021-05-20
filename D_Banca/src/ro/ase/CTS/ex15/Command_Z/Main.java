package ro.ase.CTS.ex15.Command_Z;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ContBancar bancar=new ContBancar("Diana");
		
		ManagerComenzi managerComenzi=new ManagerComenzi();
		managerComenzi.invoca(new CommandConstituire(bancar, 420));
		managerComenzi.executaComanda();
		managerComenzi.invoca(new CommandDepunere(bancar, 50));
		managerComenzi.executaComanda();
		managerComenzi.invoca(new CommandRetragere(bancar, 44));
		managerComenzi.executaComanda();
		managerComenzi.invoca(new CommandRetragere(bancar, 4433));
		managerComenzi.executaComanda();
		
	}
}
