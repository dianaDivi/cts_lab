package ro.ase.cts.adapter.clase;

public class Main {
	public static void rezervaSiVindeBilet(eBiletOnLine biletOnLine) {
		biletOnLine.rezervaBiletOnLine();
		biletOnLine.vindeBiletOnLine();
		
	}
	
	public static void rezervaBiletCasa(Bilet bilet) {
		bilet.rezervareBiletCuPretul();
		bilet.vindereaBiletCuPretul();
	}

	public static void main(String[] args) {
		//adapter de clase
		
		Bilet bilet=new Bilet(200);
		eBiletOnLine biletOnLine=new AdapterBiletClase(9);
		
		rezervaSiVindeBilet(biletOnLine);
		rezervaBiletCasa(bilet);
		
		//adaptar de obiecte
		AdapterBiletClase adapterBiletClase=new AdapterBiletClase(33);
		adapterBiletClase.rezervareBiletCuPretul();
		adapterBiletClase.vindereaBiletCuPretul();
	}

}
