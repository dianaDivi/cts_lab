package ro.ase.CTS.command;

public class Main {

	public static void main(String[] args) {
		Command command=new CommandAjutorFarmacist(3);
		Operator operator=new Operator();
		
		operator.invoca(command);
		
		new Operator().invoca(new CommandFarmacist(4));
		
	}

}
