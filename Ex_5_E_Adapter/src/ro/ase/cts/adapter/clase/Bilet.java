package ro.ase.cts.adapter.clase;

public class Bilet {
	private float pret;

	public Bilet(float pret) {
		super();
		this.pret = pret;
	}
	
	public void rezervareBiletCuPretul() {
		System.out.println("A fost rezervat biletul cu pretul: "+pret);
	}
	
	public void vindereaBiletCuPretul() {
		System.out.println("A fost vandut biletul cu pretul: "+pret);
	}
	

}
