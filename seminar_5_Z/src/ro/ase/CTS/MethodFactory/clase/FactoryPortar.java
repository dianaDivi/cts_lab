package ro.ase.CTS.MethodFactory.clase;

public class FactoryPortar implements JucatorFactory {

	@Override
	public Jucator creareJucator(String numeJucator) {
		return new Portar(numeJucator);
	}

	
	

}
