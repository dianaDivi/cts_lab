package ro.ase.CTS.ex8.Composite;

public class Sectie implements ComponentaSpital{
	private String numeSectie;

	public Sectie(String numeSectie) {
		super();
		this.numeSectie = numeSectie;
	}

	@Override
	public void adaugaNod(ComponentaSpital componentaSpital) {
		throw new IllegalAccessError("Aceasta  metoda nu poate fi accesata");
		
	}

	@Override
	public void stergeNod(ComponentaSpital componentaSpital) {
		throw new IllegalAccessError("Aceasta  metoda nu poate fi accesata");
		
	}

	@Override
	public ComponentaSpital getNod(int index) {
		throw new IllegalAccessError("Aceasta  metoda nu poate fi accesata");

	}

	@Override
	public void afisareInformatii() {
		System.out.println(numeSectie);
	}
	
	
}
