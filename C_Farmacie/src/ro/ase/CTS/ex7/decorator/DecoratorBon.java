package ro.ase.CTS.ex7.decorator;

public class DecoratorBon extends DecoratorAbstract{

	public DecoratorBon(IBon iBon) {
		super(iBon);
		
	}
	
	@Override
	public void afisareBon() {
		System.out.println("La multi ani");
		
	}
	
}
