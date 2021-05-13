package ro.ase.CTS.ex8.composite;

public class Item implements ComponentaMedicamente{
	private String numeItem;
	
	

	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugaNod(ComponentaMedicamente componenta) {
		throw new IllegalAccessError("Aceasta meth neacceptata");
		
	}

	@Override
	public void stergeNod(ComponentaMedicamente componenta) {
		throw new IllegalAccessError("Aceasta meth neacceptata");
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Item: "+numeItem);
	}

	@Override
	public ComponentaMedicamente getComponenta(int index) {
		throw new IllegalAccessError("Aceasta meth neacceptata");

	}

}
