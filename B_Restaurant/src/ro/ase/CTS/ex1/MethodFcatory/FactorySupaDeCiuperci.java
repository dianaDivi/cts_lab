package ro.ase.CTS.ex1.MethodFcatory;

public class FactorySupaDeCiuperci implements FactorySupa {

	@Override
	public Supa serviceSupa() {
		return new SupaDeCiuperci();
	}

}
