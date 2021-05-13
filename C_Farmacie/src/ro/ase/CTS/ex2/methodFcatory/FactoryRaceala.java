package ro.ase.CTS.ex2.methodFcatory;

public class FactoryRaceala implements FactoryMedicamente {

	@Override
	public Medicamente creareMedicament(String nume, float pret) {
		return new Raceala(nume, pret);
	}

}
