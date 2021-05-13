package ro.ase.CTS.ex11.Strategy;

public class Card implements ModPlata {

	@Override
	public void plateste(String numePersoana, float suma) {
		System.out.println(numePersoana +" va realiza plata cu card in suma de: "+suma);
		
	}

}
