package ro.ase.CTS.ex16.Chain;

public class ContEconomii extends Cont {

	public ContEconomii(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizarePlata(float sumaPrimita) {
		if(sumaPrimita < super.getSold()) {
			System.out.println("S-a realizat plata in contul de economii in suma de: "+sumaPrimita);
			super.setSold(super.getSold()-sumaPrimita);
			}else {
				super.getSuccesor().realizarePlata(sumaPrimita);

			}
	}

}
