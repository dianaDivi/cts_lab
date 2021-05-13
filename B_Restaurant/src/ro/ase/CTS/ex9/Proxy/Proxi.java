package ro.ase.CTS.ex9.Proxy;

public class Proxi implements IOperatoriRezervari {
	private OperatoriRezervare operator;
	private int nrMinimPersoane;
	
	

	public Proxi(OperatoriRezervare operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane = nrMinimPersoane;
	}



	@Override
	public void rezervare(int nrPersoane) {
		if(nrPersoane>=nrMinimPersoane) {
			operator.rezervare(nrPersoane);
		}else {
			System.out.println("Numarul de "+ nrPersoane+"  persoane este insuficient pentru rezervare, va asteptam la restaurantul "+ operator.getNumeLocatie());
		}
	}

}
