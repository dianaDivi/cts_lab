package ro.ase.CTS.ex8.composite;

public interface ComponentaMedicamente {
	public void adaugaNod(ComponentaMedicamente componenta);
	public void stergeNod(ComponentaMedicamente componenta);
	public void afiseazaInformatii();
	ComponentaMedicamente getComponenta(int index) ;
	
}
