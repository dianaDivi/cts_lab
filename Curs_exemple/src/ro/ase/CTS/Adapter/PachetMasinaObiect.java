package ro.ase.CTS.Adapter;

public class PachetMasinaObiect extends MasinaInchiriata implements PachetTuristic  {

	public PachetMasinaObiect(int cod, String nume) {
		super(cod, nume);
		
	}

	
	@Override
	public void descriere() {
		System.out.println( super.toString());
		
	}

}
