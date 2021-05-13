package ro.ase.CTS.ex2.methodFcatory;

public class Durere extends Medicamente{

	public Durere(String nume, float pret) {
		super(nume, pret);
		}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Durere [getNume()=");
		builder.append(getNume());
		builder.append(", getPret()=");
		builder.append(getPret());
		builder.append("]");
		return builder.toString();
	}
	

}
