package ro.ase.CTS.ex12.Observer;

public interface Subject {
	public void adaugaObserver(Observer observer);
	public void stergeObserver(Observer observer);
	public void trimiteNotificare(String mesaj);
}
