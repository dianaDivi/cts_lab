package ro.ase.CTS.Command;

public class Main {

	public static void main(String[] args) {
		PachetTuristic pachetTuristic=new PachetCazare(0);
		
		Operator operator=new Operator();
		
		Command command=new CommandRezervare(pachetTuristic);
		Command command2=new CommandVanzare(pachetTuristic);
		
		operator.invoca(command);
		operator.invoca(command2);

	}

}
