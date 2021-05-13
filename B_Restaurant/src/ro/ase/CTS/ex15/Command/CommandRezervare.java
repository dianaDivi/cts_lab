package ro.ase.CTS.ex15.Command;

public class CommandRezervare extends Command{

	public CommandRezervare(int nrMasa, String numePersoana) {
		super(nrMasa, numePersoana);
	}

	@Override
	public void execute() {
		System.out.println("Masa "+super.getNrMasa()+" a fost rezervata de catre: "+super.getNumePersoana());
		
	}

}
