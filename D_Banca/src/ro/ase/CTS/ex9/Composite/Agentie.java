package ro.ase.CTS.ex9.Composite;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements ComponentaAgentii{
	private String nume;
	private List< ComponentaAgentii >listaAgentii;
	
	

	public Agentie(String nume) {
		super();
		this.nume = nume;
		this.listaAgentii = new ArrayList<ComponentaAgentii>();
	}

	@Override
	public void adaugaNod(ComponentaAgentii componenta) {
		listaAgentii.add(componenta);
	}

	@Override
	public void stergeNod(ComponentaAgentii componenta) {
		listaAgentii.remove(componenta);
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println( "Agentie: "+nume);
		for (ComponentaAgentii componentaAgentii : listaAgentii) {
			componentaAgentii.afiseazaInformatii();
		}
	}

	@Override
	public ComponentaAgentii getComponenta(int index) {
		if(index>0 && index<listaAgentii.size()) {
			return listaAgentii.get(index);
		}else {
			throw new IllegalArgumentException("Element neidentificat");
		}
	}

}
