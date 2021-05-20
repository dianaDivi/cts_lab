package ro.ase.CTS.ex6.Decorator;

public class DecoratorContactLess  extends DecoratorAbstract{
	
	
	public DecoratorContactLess(IPlata iPlata) {
		super(iPlata);
	}

	@Override
	public void descrierePlata() {
		System.out.println("Plata se efectuaeaza cu contact less");
	}
}
