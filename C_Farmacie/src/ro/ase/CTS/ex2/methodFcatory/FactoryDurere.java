package ro.ase.CTS.ex2.methodFcatory;

public class FactoryDurere implements FactoryMedicamente {

	@Override
	public Medicamente creareMedicament(String nume, float pret) {
		return new Durere(nume, pret);
	}

}
