package ro.ase.CTS.ex7.Decorator_Z;

//cuMesajSustinere
public class DecoratorConcretSustinere extends DecoratorAbstract {

	public DecoratorConcretSustinere(BiletAbstract biletAbstract) {
		super(biletAbstract);
		
	}

	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Sustinere echipa: "+((Bilet)(super.getBiletAbstract())).getNumeEchipaGazda());
		
	}
	
	
}
