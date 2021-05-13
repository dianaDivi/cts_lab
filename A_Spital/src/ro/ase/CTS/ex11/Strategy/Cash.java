package ro.ase.CTS.ex11.Strategy;

public class Cash implements ModPlata{

	@Override
	public void plateste(String numePersoana, float suma) {
		System.out.println(numePersoana +" va realiza plata cash in suma de: "+suma);
		
	}

}
