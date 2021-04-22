package ro.ase.CTS.clase;

import java.util.ArrayList;
import java.util.List;

import ro.ase.CTS.client.Observer;

public class Agentie implements Subject {
	private String numeAgentie;
	private List<Observer> listaObserveri;
	
	

	public Agentie(String numeAgentie) {
		super();
		this.numeAgentie = numeAgentie;
		listaObserveri = new ArrayList<Observer>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		listaObserveri.add(observer);
		
	}

	@Override
	public void stergeObserver(Observer observer) {
		listaObserveri.remove(observer);
		
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for(Observer observer:listaObserveri) {
			observer.receptionareMesaj(numeAgentie+" : "+mesaj);
		}
		
	}
	
	public void notificareOfertaNoua() {
		trimiteNotificare("O noua oferta afost adaugata in catalog");
	}
	
	public void notificareReducerePret() {
		trimiteNotificare("Preturile au fost reduse");
	}

}
