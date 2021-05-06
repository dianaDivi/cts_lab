package ro.ase.CTS.ex8.Composite;

public class Item implements ComponentaMeniu {
	private String numeItem;
	
	
	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugaNod(ComponentaMeniu componenta) {
		//illegan
		throw new IllegalAccessError("Metoda nu este implementata");
	}

	@Override
	public void stergeNod(ComponentaMeniu componenta) {
		throw new IllegalAccessError("Metoda nu este implementata");
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Item: "+numeItem);
		
	}

	@Override
	public ComponentaMeniu getComponenta(int index) throws Exception {
		throw new IllegalAccessError("Metoda nu este implementata");

	}

}
