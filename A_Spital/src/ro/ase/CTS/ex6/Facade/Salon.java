package ro.ase.CTS.ex6.Facade;

import java.util.ArrayList;
import java.util.List;

public class Salon {
	private List<Boolean> listaPaturi;
	
	public Salon() {
		listaPaturi=new ArrayList<>();
		for(int i=0;i<6;i++) {
			listaPaturi.add(true);
		}
		for(int i=6;i<16;i++) {
			listaPaturi.add(false);
		}
	}

	public boolean situatieSalon(int codPat) {
		return listaPaturi.contains(codPat);
	}
}
