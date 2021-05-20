package ro.ase.CTS.ex1.MethodFcatory;

public class FactorySupaDeLegume implements FactorySupa{

	@Override
	public Supa serviceSupa() {
		return new SupaDeLegume();
	}

}
