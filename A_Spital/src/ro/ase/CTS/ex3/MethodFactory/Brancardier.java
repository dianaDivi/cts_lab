package ro.ase.CTS.ex3.MethodFactory;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}
	
	

}
