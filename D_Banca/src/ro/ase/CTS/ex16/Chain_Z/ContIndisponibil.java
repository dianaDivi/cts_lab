package ro.ase.CTS.ex16.Chain_Z;

public class ContIndisponibil extends Cont{

	public ContIndisponibil(String detinator) {
		super(detinator, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarePlata(float sumaPrimita) {
		System.out.println("Nu se poate realiza comanda la suma de " + sumaPrimita);		
	}

}
