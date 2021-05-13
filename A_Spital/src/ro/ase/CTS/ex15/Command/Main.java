package ro.ase.CTS.ex15.Command;

public class Main {

	public static void main(String[] args) {
		new Operator().invoca(new CommandInternare("Diana", "medie"));
		new Operator().invoca(new CommandTratare("Ccc", "rea"));

	}

}
