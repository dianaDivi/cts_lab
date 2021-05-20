package ro.ase.CTS.ex1.MethodFcatory;

public class FactorySupaDeVita implements FactorySupa{

	@Override
	public Supa serviceSupa() {
		return new SupaDeVita();
	}

}
