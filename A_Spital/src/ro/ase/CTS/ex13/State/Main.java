package ro.ase.CTS.ex13.State;

public class Main {

	public static void main(String[] args) {
		Pacient pacient=new Pacient("Diana");
		pacient.externat();
		pacient.internat();
		pacient.SubObservatie();
	}

}
