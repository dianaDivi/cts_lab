package ro.ase.CTS.ex3.MethodFactory;

public class FactoryAsistent implements FactoryPersonalSpital{

	@Override
	public PersonalSpital creare(String numePersonal) {
		return new Asistent(numePersonal);
	}

}
