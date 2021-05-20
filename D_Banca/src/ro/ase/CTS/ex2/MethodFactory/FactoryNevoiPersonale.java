package ro.ase.CTS.ex2.MethodFactory;

public class FactoryNevoiPersonale implements FactoroCredit{

	@Override
	public ICredit creareCredit() {
		return new NevoiPersoanle();
	}

}
