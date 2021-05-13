package ro.ase.CTS.ex8.composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMedicamente{
	private String numeSectiune;
	private List<ComponentaMedicamente>listaComponente;
	
	

	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		this.listaComponente = new ArrayList<>();
	}

	@Override
	public void adaugaNod(ComponentaMedicamente componenta) {
		listaComponente.add(componenta);
		
	}

	@Override
	public void stergeNod(ComponentaMedicamente componenta) {
		listaComponente.remove(componenta);
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Sectiunea: "+ numeSectiune);
		for (ComponentaMedicamente componentaMedicamente : listaComponente) {
			componentaMedicamente.afiseazaInformatii();
		}
		
	}

	@Override
	public ComponentaMedicamente getComponenta(int index) {
		if(index> 0 && index <= listaComponente.size()) {
			return listaComponente.get(index);
		}else {
			 throw new IllegalAccessError("Nu s-a gasit sectiunea");
		}
	}

}
