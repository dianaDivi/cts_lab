package ro.ase.CTS.Receptie;

import java.util.ArrayList;
import java.util.List;

public class CamereLibere {
	private List<Integer> listaCamereLibere;

	public CamereLibere() {
		super();
		this.listaCamereLibere = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			listaCamereLibere.add(i+1);
		}
	}
	
	public boolean verificareCameraLibera(int codCamera) {
		return listaCamereLibere.contains(codCamera);
	}

}
