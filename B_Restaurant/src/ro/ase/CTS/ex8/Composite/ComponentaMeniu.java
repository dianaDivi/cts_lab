package ro.ase.CTS.ex8.Composite;

public interface ComponentaMeniu {
	public void adaugaNod(ComponentaMeniu componenta);
	public void stergeNod(ComponentaMeniu componenta);
	public void afiseazaInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;
	
}
