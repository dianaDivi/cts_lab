package ro.ase.CTS.Facade;

public class CompanieAeriana {
	private String numeCompanie;

	public CompanieAeriana(String numeCompanie) {
		super();
		this.numeCompanie = numeCompanie;
	}

	public String getNumeCompanie() {
		return numeCompanie;
	}

	public void setNumeCompanie(String numeCompanie) {
		this.numeCompanie = numeCompanie;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompanieAeriana [numeCompanie=");
		builder.append(numeCompanie);
		builder.append("]");
		return builder.toString();
	}

	public Zbor rezervaBilet(String orasPlecare, String destinatie) {
		Zbor zbor=new Zbor(this, orasPlecare, destinatie);
		return zbor;
	}
}
