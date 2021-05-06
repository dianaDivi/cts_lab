package ro.ase.CTS.ex8.Composite;

public interface ComponentaSpital {
	public void adaugaNod(ComponentaSpital componentaSpital);
	public void stergeNod(ComponentaSpital componentaSpital);
	public ComponentaSpital getNod(int index);
	public void afisareInformatii();

}
