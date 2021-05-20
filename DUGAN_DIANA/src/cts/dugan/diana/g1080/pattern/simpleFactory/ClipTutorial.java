package cts.dugan.diana.g1080.pattern.simpleFactory;

public class ClipTutorial implements IClip {

	private String denumire;
	private int durata;
	
	public ClipTutorial(String denumire, int durata) {
		super();
		this.denumire = denumire;
		this.durata = durata;
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




	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public String toString() {
		return "ClipTutorial [denumire=" + denumire + ", durata=" + durata + "]";
	}
	
	

}
