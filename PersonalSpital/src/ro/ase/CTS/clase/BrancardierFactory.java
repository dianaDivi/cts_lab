package ro.ase.CTS.clase;

public class BrancardierFactory implements FactoryPersonal{

	@Override
	public PersonalSpital crearePersonal(String nume) {
		// TODO Auto-generated method stub
		return new Brancardier(nume);
	}

}
