package ro.ase.CTS.ex9.Strategy;

public class OperatoriRezervare implements IOperatoriRezervari {
	private String numeLocatie;
	
	
	
	public OperatoriRezervare(String numeLocatie) {
		super();
		this.numeLocatie = numeLocatie;
	}



	public String getNumeLocatie() {
		return numeLocatie;
	}



	@Override
	public void rezervare(int nrPersoane) {
		System.out.println("S-a realizat rezervarea de "+nrPersoane+" persoane la restaurantul "+this.numeLocatie);
	}

	
}
