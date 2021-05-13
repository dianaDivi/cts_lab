package ro.ase.CTS.ex2.methodFcatory;

public class Body extends Medicamente{

	public Body(String nume, float pret) {
		super(nume, pret);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Body [getNume()=");
		builder.append(getNume());
		builder.append(", getPret()=");
		builder.append(getPret());
		builder.append("]");
		return builder.toString();
	}

	
}
