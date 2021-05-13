package ro.ase.CTS.Adapter;

public class MasinaInchiriata {
	private int cod;
	private String nume;
	
	public void masinaInchiriata() {
		System.out.println(" A fost inchiriata masina "+ toString());
	}
	
	public MasinaInchiriata(int cod, String nume) {
		super();
		this.cod = cod;
		this.nume = nume;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MasinaInchiriata [cod=");
		builder.append(cod);
		builder.append(", nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}
	
	

}
