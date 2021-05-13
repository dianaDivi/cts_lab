package ro.ase.CTS.ex15.Command;

public class Main {

	public static void main(String[] args) {
		Command rezervare=new CommandRezervare(0, "Diaa");
		Operator operator=new Operator();
		
		operator.invoca(rezervare);
		
		new Operator().invoca(new CommandOcupata(1, "Vlas"));
		new Operator().invoca(new CommandRezervare(2, "Diana"));

	}

}
