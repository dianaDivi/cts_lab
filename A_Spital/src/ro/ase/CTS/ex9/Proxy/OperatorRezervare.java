package ro.ase.CTS.ex9.Proxy;

public class OperatorRezervare  implements IOperatorAsigurare{
	private String numePacient;
	
	public OperatorRezervare(String numePacient) {
		super();
		this.numePacient = numePacient;
		
	}

	public String getNumePacient() {
		return numePacient;
	}

	@Override
	public void afisareAsigurare(boolean ifAsigurare) {
		System.out.println("Pacientul "+numePacient+" detine asigurare: "+ifAsigurare);
		
	}

	
	
	
}
