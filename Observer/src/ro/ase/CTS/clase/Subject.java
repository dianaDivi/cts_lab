package ro.ase.CTS.clase;

import ro.ase.CTS.client.Observer;

public interface Subject {

	public void adaugaObserver(Observer observer);
	public void stergeObserver(Observer observer);
	public void trimiteNotificare(String mesaj);
}
