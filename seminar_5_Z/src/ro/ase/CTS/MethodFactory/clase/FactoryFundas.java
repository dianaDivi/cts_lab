package ro.ase.CTS.MethodFactory.clase;

public class FactoryFundas implements JucatorFactory{

	@Override
	public Jucator creareJucator(String numeJucator) {
		return new Fundas(numeJucator);
	}

}
