package ro.ase.CTS.seminar_5.factory;

public class TechProdactFcatory  extends AbstractProductFcatory{

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		return new TechProduct("generic");
	}

	@Override
	public String getCatalog() {
		
		return "generic - Generic tech prod" ;
	}

}
