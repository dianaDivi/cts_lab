package ro.ase.CTS.ex2.Builder;

public class AbstractRezervareBuilder implements Builder{
	private Rezervare rezervare;
	
	
	

	public AbstractRezervareBuilder() {
		this.rezervare=new Rezervare(0, false, false, false, false, false);
	}

	@Override
	public Rezervare builder() {
		
		return rezervare;
	}
	
	
	public AbstractRezervareBuilder setNrRezervare(int nrRezervare) {
		rezervare.setNrRezervare(nrRezervare);
		return this;
	}
	
	public AbstractRezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
		rezervare.setAsezareLaGeam(asezareLaGeam);
		return this;
	}
	
	public AbstractRezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
		rezervare.setScauneErgonomice(scauneErgonomice); 
		return this;
	}
	
	public AbstractRezervareBuilder setDecorareMasa(boolean decorareMasa) {
		rezervare.setDecorareMasa(decorareMasa);
		return this;
	}
	
	public AbstractRezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
		return this;
	}
	
	public AbstractRezervareBuilder setGenMuzica(boolean genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

}
