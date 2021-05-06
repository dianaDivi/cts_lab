package ro.ase.CTS.ex3.MethodFactory;

public class Asistent extends PersonalSpital{

	public Asistent(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent [getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}



}
