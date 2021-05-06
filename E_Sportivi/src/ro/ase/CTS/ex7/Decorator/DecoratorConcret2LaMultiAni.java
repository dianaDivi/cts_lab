package ro.ase.CTS.ex7.Decorator;

public class DecoratorConcret2LaMultiAni extends DecoratorAbstract {

	public DecoratorConcret2LaMultiAni(BiletAbstract biletAbstract) {
		super(biletAbstract);
		
	}
	
	@Override
	public void rezervaBilet() {
		System.out.println("La multi ani");
	}
}
