package ro.ase.CTS.ex6.Facade;

import java.util.ArrayList;
import java.util.List;

public class Medic {
	private List<Boolean> listaPacienti;
	private String numeMedic;
	
	public Medic() {
		listaPacienti=new ArrayList<Boolean>();
		for(int i=0;i<6;i++) {
			listaPacienti.add(true);
		}
		
		for(int i=6;i<18;i++) {
			listaPacienti.add(false);
		}
		this.numeMedic="Vlad";
	}
	
	public String getNumeMedic() {
		return numeMedic;
	}
	public void setNumeMedic(String numeMedic) {
		this.numeMedic = numeMedic;
	}
	
	
	public boolean obtineSituatiePacient(int cod) {
		return listaPacienti.contains(cod);
	}
	
	

}
