package ro.ase.CTS.Facade;

public class Hotel {
	private String nume;

	public Hotel(String nume) {
		super();
		this.nume = nume;
	}
	
	
	
	public void rezervaCamera(String numeOras) {
		System.out.println(this.nume+" in orasul "+ numeOras);
	}

}
