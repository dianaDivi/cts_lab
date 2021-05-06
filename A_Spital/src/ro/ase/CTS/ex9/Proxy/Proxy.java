package ro.ase.CTS.ex9.Proxy;

public class Proxy implements IOperatorAsigurare{
	private OperatorRezervare operatorRezervare;

	public Proxy(OperatorRezervare operatorRezervare) {
		super();
		this.operatorRezervare = operatorRezervare;
	}

	@Override
	public void afisareAsigurare(boolean ifAsigurare) {
		if(ifAsigurare) {
			operatorRezervare.afisareAsigurare(ifAsigurare);
		}
		else {
			System.out.println(operatorRezervare.getNumePacient()+" nu are asigurare");
		}
		
	}
	
	
}
