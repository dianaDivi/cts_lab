package ro.ase.CTS.ex16.Chain;

public class ContIndisponibil extends Cont{

	public ContIndisponibil(String detinator, float sold) {
		super(detinator, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarePlata(float sumaPrimita) {
		System.out.println("Nu se poate realiza comanda la suma de " + sumaPrimita);		
	}

}
