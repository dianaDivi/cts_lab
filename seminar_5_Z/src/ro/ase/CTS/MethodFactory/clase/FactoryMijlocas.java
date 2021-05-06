package ro.ase.CTS.MethodFactory.clase;


public class FactoryMijlocas implements JucatorFactory{

	@Override
	public Jucator creareJucator(String numeJucator) {
		return new Mijlocas(numeJucator);
	}

}
