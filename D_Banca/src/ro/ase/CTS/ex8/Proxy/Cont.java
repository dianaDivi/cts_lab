package ro.ase.CTS.ex8.Proxy;

public class Cont implements IContCredit{
	private String MonedaCont;

	public Cont(String monedaCont) {
		super();
		MonedaCont = monedaCont;
	}

	public String getMonedaCont() {
		return MonedaCont;
	}

	public void setMonedaCont(String monedaCont) {
		MonedaCont = monedaCont;
	}

	@Override
	public String toString() {
		return "Cont [MonedaCont=" + MonedaCont + "]";
	}

	@Override
	public void afisareMetodaPlata(String moneda) {
		System.out.println("se efectueaza o plata de Cont [MonedaCont  in" + MonedaCont + "]");
		
	}
	
	

}
