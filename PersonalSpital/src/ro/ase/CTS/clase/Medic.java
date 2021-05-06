package ro.ase.CTS.clase;

public class Medic extends PersonalSpital {

	public Medic(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medic " + getNume();
	}
	
	

}
