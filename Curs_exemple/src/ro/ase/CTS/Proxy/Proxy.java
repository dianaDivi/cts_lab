package ro.ase.CTS.Proxy;



public class Proxy implements Interfata{
	
	private Entitate entitate;
	
	

	public Proxy(Entitate entitate) {
		super();
		this.entitate = entitate;
	}



	public Proxy(Persoana persoana) {
		super();
		this.entitate = new Entitate(persoana);
	}



	@Override
	public void descriePachet() {
		entitate.descriePachet();
	}



	@Override
	public void rezervaPachet() {
		if(entitate.getPersoana().getVarsta() >=65) {
			entitate.rezervaPachet();
		}else {
			System.out.println("Nu ii este permis");
		}
	}
	
	
	
}
