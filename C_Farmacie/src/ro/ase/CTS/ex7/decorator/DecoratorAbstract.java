package ro.ase.CTS.ex7.decorator;

public class DecoratorAbstract  implements IBon{
	private IBon iBon;
	
	public DecoratorAbstract(IBon iBon) {
		super();
		this.iBon = iBon;
	}

	@Override
	public void afisareBon() {
		iBon.afisareBon();
		
	}

	public IBon getIBan() {
		return iBon;
	}
	
}
