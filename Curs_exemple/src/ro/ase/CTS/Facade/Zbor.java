package ro.ase.CTS.Facade;

public class Zbor {
	private CompanieAeriana companieAeriana;
	private String orasPlecare;
	private String destinatie;
	public Zbor(CompanieAeriana companieAeriana, String orasPlecare, String destinatie) {
		super();
		this.companieAeriana = companieAeriana;
		this.orasPlecare = orasPlecare;
		this.destinatie = destinatie;
	}
	public CompanieAeriana getCompanieAeriana() {
		return companieAeriana;
	}
	public void setCompanieAeriana(CompanieAeriana companieAeriana) {
		this.companieAeriana = companieAeriana;
	}
	public String getOrasPlecare() {
		return orasPlecare;
	}
	public void setOrasPlecare(String orasPlecare) {
		this.orasPlecare = orasPlecare;
	}
	public String getDestinatie() {
		return destinatie;
	}
	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Zbor [companieAeriana=");
		builder.append(companieAeriana);
		builder.append(", orasPlecare=");
		builder.append(orasPlecare);
		builder.append(", destinatie=");
		builder.append(destinatie);
		builder.append("]");
		return builder.toString();
	}
	
	
}
