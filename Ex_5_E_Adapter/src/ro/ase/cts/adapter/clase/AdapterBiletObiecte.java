package ro.ase.cts.adapter.clase;

public class AdapterBiletObiecte implements eBiletOnLine{
	//avem nevoie de un obiect
	Bilet bilet;
	
	
	public AdapterBiletObiecte(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnLine() {
		bilet.vindereaBiletCuPretul();
	}

	@Override
	public void rezervaBiletOnLine() {
		bilet.rezervareBiletCuPretul();
	}
	
	

}
