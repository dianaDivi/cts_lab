package ro.ase.CTS.ex2.Builder;

public class Rezervare {
	private int nrRezervare;
	private boolean asezareLaGeam;
	private boolean scauneErgonomice;
	private boolean decorareMasa;
	private boolean muzicaAmbientalaPersonalizata;
	private boolean genMuzica;
	
	
	
	public Rezervare(int nrRezervare, boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareMasa,
			boolean muzicaAmbientalaPersonalizata, boolean genMuzica) {
		super();
		this.nrRezervare = nrRezervare;
		this.asezareLaGeam = asezareLaGeam;
		this.scauneErgonomice = scauneErgonomice;
		this.decorareMasa = decorareMasa;
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		this.genMuzica = genMuzica;
	}
	public int getNrRezervare() {
		return nrRezervare;
	}
	public void setNrRezervare(int nrRezervare) {
		this.nrRezervare = nrRezervare;
	}
	public boolean isAsezareLaGeam() {
		return asezareLaGeam;
	}
	public void setAsezareLaGeam(boolean asezareLaGeam) {
		this.asezareLaGeam = asezareLaGeam;
	}
	public boolean isScauneErgonomice() {
		return scauneErgonomice;
	}
	public void setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
	}
	public boolean isDecorareMasa() {
		return decorareMasa;
	}
	public void setDecorareMasa(boolean decorareMasa) {
		this.decorareMasa = decorareMasa;
	}
	public boolean isMuzicaAmbientalaPersonalizata() {
		return muzicaAmbientalaPersonalizata;
	}
	public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
	}
	public boolean isGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(boolean genMuzica) {
		this.genMuzica = genMuzica;
	}
	@Override
	public String toString() {
		return "Rezervare [nrRezervare=" + nrRezervare + ", asezareLaGeam=" + asezareLaGeam + ", scauneErgonomice="
				+ scauneErgonomice + ", decorareMasa=" + decorareMasa + ", muzicaAmbientalaPersonalizata="
				+ muzicaAmbientalaPersonalizata + ", genMuzica=" + genMuzica + "]";
	}
	
	

}
