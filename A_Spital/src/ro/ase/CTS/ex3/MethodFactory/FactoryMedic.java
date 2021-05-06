package ro.ase.CTS.ex3.MethodFactory;

public class FactoryMedic implements FactoryPersonalSpital{

	@Override
	public PersonalSpital creare(String numePersonal) {
		return new Medic(numePersonal);
	}

}
