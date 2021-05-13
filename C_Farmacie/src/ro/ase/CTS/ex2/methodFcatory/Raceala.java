package ro.ase.CTS.ex2.methodFcatory;

public class Raceala extends Medicamente{

	public Raceala(String nume, float pret) {
		super(nume, pret);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raceala [getNume()=");
		builder.append(getNume());
		builder.append(", getPret()=");
		builder.append(getPret());
		builder.append("]");
		return builder.toString();
	}
	
	

}
