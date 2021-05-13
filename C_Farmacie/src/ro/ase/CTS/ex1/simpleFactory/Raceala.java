package ro.ase.CTS.ex1.simpleFactory;

public class Raceala extends Medicament{

	public Raceala(String denumire, float pret) {
		super(denumire, pret);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raceala [getDenumire()=");
		builder.append(getDenumire());
		builder.append(", getPret()=");
		builder.append(getPret());
		builder.append("]");
		return builder.toString();
	}

}
