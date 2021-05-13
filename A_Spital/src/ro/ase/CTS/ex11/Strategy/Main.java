package ro.ase.CTS.ex11.Strategy;

public class Main {

	public static void main(String[] args) {
			
		new Pacient("Claw", new Card()).plateste(4300);

		new Pacient("Diana", new Cash()).plateste(499);
	}

}
