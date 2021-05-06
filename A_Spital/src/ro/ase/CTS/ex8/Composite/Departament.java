package ro.ase.CTS.ex8.Composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements ComponentaSpital {

	private String denumireDepartament;
	private List<ComponentaSpital >lista;
	
	public Departament(String denumireDepartament) {
		super();
		this.denumireDepartament = denumireDepartament;
		this.lista = new ArrayList<ComponentaSpital>();
	}

	@Override
	public void adaugaNod(ComponentaSpital componentaSpital) {
		lista.add(componentaSpital);
		
	}

	@Override
	public void stergeNod(ComponentaSpital componentaSpital) {
		lista.remove(componentaSpital);
		
	}

	@Override
	public ComponentaSpital getNod(int index) {
		return lista.get(index);
	}

	@Override
	public void afisareInformatii() {
		System.out.println("Departamentul: "+ denumireDepartament);
		for(ComponentaSpital c: lista) {
			c.afisareInformatii();
		}
	}
	
	
}
