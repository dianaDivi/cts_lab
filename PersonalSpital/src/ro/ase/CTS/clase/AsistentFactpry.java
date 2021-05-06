package ro.ase.CTS.clase;

public class AsistentFactpry implements FactoryPersonal {

	@Override
	public PersonalSpital crearePersonal(String nume) {
		
		return new Asistent(nume);
	}

}
