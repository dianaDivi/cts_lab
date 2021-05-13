package ro.ase.CTS.ex2.methodFcatory;

public class FactoryBody implements FactoryMedicamente{

	@Override
	public Medicamente creareMedicament(String nume, float pret) {
		return new Body(nume, pret);
	}

}
