package cts.dugan.diana.g1080.pattern.decorator;

public class Clip implements IClip,Modificabil {
	private String denumire;
	private int durata;
	private int momentReclama;

	public Clip(String denumire, int durata, int momentReclama) {
		super();
		this.denumire = denumire;
		this.durata = durata;
		this.momentReclama = momentReclama;
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
		System.out.println(denumire + " pornit" + "Urmeaza sa aibe reclama timp de "+ durata + " la momentul " +momentReclama);
		
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

	public int getMomentReclama() {
		return momentReclama;
	}

	public void setMomentReclama(int momentReclama) {
		this.momentReclama = momentReclama;
	}

	@Override
	public void modificaReclama(int durata, int moment) {
		this.momentReclama = moment;
		this.durata = durata;
		
	}


	
	

}
