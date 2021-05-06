package ro.ase.CTS.MethodFactory.clase;

public class FactoryAtacant implements JucatorFactory{

	@Override
	public Jucator creareJucator(String numeJucator) {
		return new Atacant(numeJucator);
	}

}
