package ro.ase.CTS.ex12.Observer;

import java.util.ArrayList;
import java.util.List;

public class Banca implements Subject{
	private String numeBanca;
	private List< Observer >listaObserveri;
	
	

	public Banca(String numeBanca) {
		super();
		this.numeBanca = numeBanca;
		this.listaObserveri = new ArrayList<>();
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
		for (Observer observer : listaObserveri) {
			observer.receptionareMesaj("Nume banca "+numeBanca+"  "+mesaj);
		}
	}
	
	public void notificaOfertaNoua() {
		trimiteNotificare("O oferta noua a fost adaugata");
	}

}
