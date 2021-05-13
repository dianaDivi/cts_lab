package ro.ase.CTS.ex1.simpleFactory;

public class Durere extends Medicament{

	public Durere(String denumire, float pret) {
		super(denumire, pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Durere [getDenumire()=");
		builder.append(getDenumire());
		builder.append(", getPret()=");
		builder.append(getPret());
		builder.append("]");
		return builder.toString();
	}

	
}
