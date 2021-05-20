package ro.ase.CTS.command;

public abstract class Command {
	private int codComanda;

	public Command(int codComanda) {
		super();
		this.codComanda = codComanda;
	}

	public int getCodComanda() {
		return codComanda;
	}

	public void setCodComanda(int codComanda) {
		this.codComanda = codComanda;
	}

	@Override
	public String toString() {
		return "Command [codComanda=" + codComanda + "]";
	}
	
	
	public abstract void execute();
}
