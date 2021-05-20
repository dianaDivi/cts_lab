package ro.ase.CTS.ex2.MethodFactory;

public class FactoryCrediteIpoptecare implements FactoroCredit {

	@Override
	public ICredit creareCredit() {
		return new CreditIpotecar();
	}

}
