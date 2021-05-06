package ro.ase.cts.adapter.clase;

public class AdapterBiletClase extends Bilet  implements eBiletOnLine {

	public AdapterBiletClase(float pret) {
		super(pret);
		
	}
	
	@Override
	public void vindeBiletOnLine() {
		super.vindereaBiletCuPretul();
	}

	@Override
	public void rezervaBiletOnLine() {
		super.rezervareBiletCuPretul();
	}

}
