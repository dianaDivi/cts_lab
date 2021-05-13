package ro.ase.CTS.ex6.facade;

import java.util.ArrayList;
import java.util.List;

public class DisponibilitateaMedicamentelor {
	
	private List< String>listaDisponibila;

	public DisponibilitateaMedicamentelor(List<String> listaDisponibila) {
		super();
		this.listaDisponibila =new ArrayList<String>();
	}

	public List<String> getListaDisponibila() {
		return listaDisponibila;
	}

	public void setListaDisponibila(List<String> listaDisponibila) {
		this.listaDisponibila = listaDisponibila;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DisponibilitateaMedicamentelor [listaDisponibila=");
		builder.append(listaDisponibila);
		builder.append("]");
		return builder.toString();
	}
	
	

}
