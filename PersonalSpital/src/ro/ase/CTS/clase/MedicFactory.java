package ro.ase.CTS.clase;

public class MedicFactory implements FactoryPersonal {

	@Override
	public PersonalSpital crearePersonal(String nume) {
		return new Medic(nume);
	}

}
