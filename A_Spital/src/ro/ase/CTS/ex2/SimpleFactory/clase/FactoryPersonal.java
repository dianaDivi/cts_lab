package ro.ase.CTS.ex2.SimpleFactory.clase;

public class FactoryPersonal {
	public static PersonalSpital crearePersonal(TipPersonal tipPersonal, String numePersonal) {
		switch (tipPersonal) {
		case Brancardier:
			return new Barcardier(numePersonal);
		case Asistent:
			return new Asistent(numePersonal);
		case Medic:
			return new Medic(numePersonal);

		default:
			return null;
		}
		
	}
}
