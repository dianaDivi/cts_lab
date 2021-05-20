package cts.dugan.diana.g1080.pattern.composite;

public class Clip implements IClip, IPlaylist{
	private String denumire;
	private int durata;
	private float scor;
	
	public Clip(String denumire, int durata, float scor) {
		super();
		this.denumire = denumire;
		this.durata = durata;
		this.scor = scor;
	}

	public String getDenumire() {
		return denumire;
	}




	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}




	public int getDurata() {
		return durata;
	}




	public void setDurata(int durata) {
		this.durata = durata;
	}




	public float getScor() {
		return scor;
	}




	public void setScor(float scor) {
		this.scor = scor;
	}




	@Override
	public void adaugaNod(IPlaylist componenta) {
		//illegan
		throw new IllegalAccessError("Metoda nu este implementata");
	}

	@Override
	public void stergeNod(IPlaylist componenta) {
		throw new IllegalAccessError("Metoda nu este implementata");
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Item: "+ denumire);
		
	}

	@Override
	public IPlaylist getComponenta(int index) throws Exception {
		throw new IllegalAccessError("Metoda nu este implementata");

	}

	@Override
	public void pause() {
		System.out.println(denumire + " pauzat");
		
	}

	@Override
	public void stop() {
		System.out.println(denumire + " oprit");
		
	}

	@Override
	public void resume() {
		System.out.println(denumire + " repornit");
		
	}

	@Override
	public void start() {
		System.out.println(denumire + " pornit");
		
	}

}
