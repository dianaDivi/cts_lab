package ro.ase.CTS.ex15.Command;

public class CommandOcupata extends Command{

	public CommandOcupata(int nrMasa, String numePersoana) {
		super(nrMasa, numePersoana);
	}

	@Override
	public void execute() {
		System.out.println("Masa "+super.getNrMasa()+" a fost ocupata de catre: "+super.getNumePersoana());

	}

}
