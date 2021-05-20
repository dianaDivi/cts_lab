package ro.ase.CTS.ex16.Chain_Z;

public class ContCurent extends Cont{

	public ContCurent(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizarePlata(float sumaPrimita) {
		if(super.getSold() > sumaPrimita) {
			System.out.println("S-a realizat plata, cont curent in suma de: "+sumaPrimita);
			super.setSold(super.getSold()-sumaPrimita);
		}else {
			super.getSuccesor().realizarePlata(sumaPrimita);
		}
	}

	

}
