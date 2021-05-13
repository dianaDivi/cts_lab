package ro.ase.CTS.Adapter;

public class PachetMasinaInchiriata implements PachetTuristic{

	private MasinaInchiriata masinaInchiriata;
	
	public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata) {
		super();
		this.masinaInchiriata = masinaInchiriata;
	}

	@Override
	public void descriere() {
		masinaInchiriata.masinaInchiriata();
	}

}
