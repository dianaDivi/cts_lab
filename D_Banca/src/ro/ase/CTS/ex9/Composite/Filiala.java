package ro.ase.CTS.ex9.Composite;

public class Filiala implements ComponentaAgentii{
	private String numeFiliala;
	

	public Filiala(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void adaugaNod(ComponentaAgentii componenta) {
		throw new IllegalArgumentException("Comanda neidentificata");
	}

	@Override
	public void stergeNod(ComponentaAgentii componenta) {
		throw new IllegalArgumentException("Comanda neidentificata");
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("nume Item: "+numeFiliala);
	}

	@Override
	public ComponentaAgentii getComponenta(int index) {
		throw new IllegalArgumentException("Comanda neidentificata");

	}

}
