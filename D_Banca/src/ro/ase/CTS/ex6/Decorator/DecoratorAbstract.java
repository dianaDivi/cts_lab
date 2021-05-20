package ro.ase.CTS.ex6.Decorator;

public class DecoratorAbstract implements IPlata{
	private IPlata iPlata;
	
	
	public DecoratorAbstract(IPlata iPlata) {
		super();
		this.iPlata = iPlata;
	}

	@Override
	public void descrierePlata() {
		iPlata.descrierePlata();
	}
	
	public IPlata getIPlata() {
		return iPlata;
	}

}
