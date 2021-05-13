package ro.ase.CTS.ex15.Command;

public class CommandTratare extends Command{

	public CommandTratare(String numePacient, String situatie) {
		super(numePacient, situatie);
	}

	@Override
	public void executa() {
		System.out.println("Pacientul: "+super.getNumePacient()+" se afla intr-o stare: "+ super.getSituatie()+" de Tratare ");		
		
	}

}
