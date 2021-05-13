package ro.ase.CTS.ex1.simpleFactory;

public class Body extends Medicament{

	public Body(String denumire, float pret) {
		super(denumire, pret);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Body [getDenumire()=");
		builder.append(getDenumire());
		builder.append(", getPret()=");
		builder.append(getPret());
		builder.append("]");
		return builder.toString();
	}
	
	

}
