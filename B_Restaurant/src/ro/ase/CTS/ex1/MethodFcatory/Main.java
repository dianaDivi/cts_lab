package ro.ase.CTS.ex1.MethodFcatory;

public class Main {
	public static void afisareMetoda(FactorySupa factorySupa) {
		Supa supa=factorySupa.serviceSupa();
		supa.descriere();
	}
	public static void main(String[] args) {
		afisareMetoda(new FactorySupaDeLegume());
		afisareMetoda(new FactorySupaDeVita());
		afisareMetoda(new FactorySupaDeCiuperci());

	}

}
