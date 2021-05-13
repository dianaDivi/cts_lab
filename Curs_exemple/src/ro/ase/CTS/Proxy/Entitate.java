package ro.ase.CTS.Proxy;

public class Entitate implements Interfata {
	private Persoana persoana;

	public Entitate(Persoana persoana) {
		super();
		this.persoana = persoana;
	}
	
	

	public Persoana getPersoana() {
		return persoana;
	}



	public void setPersoana(Persoana persoana) {
		this.persoana = persoana;
	}



	@Override
	public String toString() {
		return "Entitate [persoana=" + persoana + "]";
	}



	@Override
	public void descriePachet() {
		System.out.println("Entitate transport");
		
	}

	@Override
	public void rezervaPachet() {
		System.out.println("Entitate transport");
		
	}

}
