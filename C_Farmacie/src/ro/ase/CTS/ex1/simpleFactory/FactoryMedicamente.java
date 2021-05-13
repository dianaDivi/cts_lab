package ro.ase.CTS.ex1.simpleFactory;

public class FactoryMedicamente {
	
	public static Medicament creareMedicament(EnumCategorie categorie, String denumire, int pret) {
		switch (categorie) {
		case Raceala:
			return new Raceala(denumire, pret);
		case Durere:
			return new Durere(denumire, pret);
		case Body:
			return new Body(denumire,pret);

		default:
			throw new IllegalAccessError("Neidentificat");
		}
	}
		

}
