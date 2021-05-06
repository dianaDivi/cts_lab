package ro.ase.CTS.ex8.Composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{
	private String numeSectiune;
	private List<ComponentaMeniu> lista;
	
	

	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		this.lista = new ArrayList<ComponentaMeniu>();
	}



	@Override
	public void adaugaNod(ComponentaMeniu componenta) {
		lista.add(componenta);
		
	}



	@Override
	public void stergeNod(ComponentaMeniu componenta) {
		lista.remove(componenta);
	}



	@Override
	public void afiseazaInformatii() {
		System.out.println("Sectiunea "+this.numeSectiune);
		for(ComponentaMeniu s: lista) {
			s.afiseazaInformatii();
		}
		
	}



	@Override
	public ComponentaMeniu getComponenta(int index) throws Exception {
		if(index> 0 && index <= lista.size()) {
			return lista.get(index);
		}else {
			 throw new Exception("Nu face parte");
		}
		
	}

	


}
