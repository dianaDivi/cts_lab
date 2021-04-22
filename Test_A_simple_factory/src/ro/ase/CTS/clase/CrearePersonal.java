package ro.ase.CTS.clase;

public class CrearePersonal {

	public PersonalSpital creareInstanta(TipPersonalSpital personalSpital) throws Exception{
		switch (personalSpital) {
		case Brancardier :
			return new PersonalBrancardier();
		case Asistent:
			return new PersoanalAsistent();
		case Medic:
			return new PersonalMedic();
		default:
			throw new Exception("Tipul nu exista");
		}
	}
}
