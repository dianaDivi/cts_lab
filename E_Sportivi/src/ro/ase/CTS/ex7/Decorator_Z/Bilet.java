package ro.ase.CTS.ex7.Decorator_Z;

public class Bilet implements BiletAbstract {
	private String numeEchipaGazda;
	private String numeOaspeti;
	private String numeClient;
	
	@Override
	public void rezervaBilet() {
		System.out.println(numeClient +" are biletul impreuna cu "+numeOaspeti+" la echipa "+numeEchipaGazda);
		
		}

	public Bilet(String numeEchipaGazda, String numeOaspeti, String numeClient) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeOaspeti = numeOaspeti;
		this.numeClient = numeClient;
	}

	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}

	public String getNumeOaspeti() {
		return numeOaspeti;
	}

	public String getNumeClient() {
		return numeClient;
	}
	
	

}
