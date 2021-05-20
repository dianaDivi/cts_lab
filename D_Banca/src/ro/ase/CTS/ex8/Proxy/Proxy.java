package ro.ase.CTS.ex8.Proxy;

public class Proxy implements IContCredit{
	private Cont cont;
	
	

	public Proxy(Cont cont) {
		super();
		this.cont = cont;
	}



	@Override
	public void afisareMetodaPlata(String moneda) {
		if(moneda.equals("RON")) {
			System.out.println("Creditul se poate efectua in Ron");
		}else {
			System.out.println("Nu se poate realiza plata");
		}
		
	}

}
