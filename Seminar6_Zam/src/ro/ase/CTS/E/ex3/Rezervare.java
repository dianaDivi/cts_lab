package ro.ase.CTS.E.ex3;

public class Rezervare {
	private int codRezervare; 
	private boolean areMancareInclusa;
	private boolean areauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzica;
	private String genMuzical;
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areauturaInclusa, boolean areScaunErgonomic,
			boolean areMuzica, String genMuzical) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areauturaInclusa = areauturaInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMuzica = areMuzica;
		this.genMuzical = genMuzical;
	}
	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public boolean isAreMancareInclusa() {
		return areMancareInclusa;
	}
	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}
	public boolean isAreauturaInclusa() {
		return areauturaInclusa;
	}
	public void setAreauturaInclusa(boolean areauturaInclusa) {
		this.areauturaInclusa = areauturaInclusa;
	}
	public boolean isAreScaunErgonomic() {
		return areScaunErgonomic;
	}
	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	public boolean isAreMuzica() {
		return areMuzica;
	}
	public void setAreMuzica(boolean areMuzica) {
		this.areMuzica = areMuzica;
	}
	public String getGenMuzical() {
		return genMuzical;
	}
	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=");
		builder.append(codRezervare);
		builder.append(", areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areauturaInclusa=");
		builder.append(areauturaInclusa);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areMuzica=");
		builder.append(areMuzica);
		builder.append(", genMuzical=");
		builder.append(genMuzical);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
