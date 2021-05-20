package ro.ase.CTS.ex9.Composite;

public interface ComponentaAgentii {
	public void adaugaNod(ComponentaAgentii componenta);
	public void stergeNod(ComponentaAgentii componenta);
	public void afiseazaInformatii();
	ComponentaAgentii getComponenta(int index) ;
}
