package ro.ase.CTS.ex13.Command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<Command> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<>();
	}
	
	public void invoca(Command command) {
		comenzi.add(command);
	}
	
	public void executaComanda() {
		if(comenzi.size()>0) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}else {
			throw new IllegalAccessError();
		}
	}
	
}
