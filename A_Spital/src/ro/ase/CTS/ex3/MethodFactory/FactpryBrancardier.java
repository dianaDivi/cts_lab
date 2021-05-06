package ro.ase.CTS.ex3.MethodFactory;

public class FactpryBrancardier implements FactoryPersonalSpital{

	@Override
	public PersonalSpital creare(String numePersonal) {
		return new Brancardier(numePersonal);
	}

}
