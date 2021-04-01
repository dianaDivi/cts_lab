package ro.ase.CTS.seminar_6.builder;

public class ProduuctFactory {

	public Product makePorduct(String type, String productName) throws UnsupportedOperationException {
		if(type.equalsIgnoreCase("tech")) {
			return new  TechProduct(productName);
		}else if(type.equalsIgnoreCase("office")) {
			return new OfficeProduct();
		}else {
			throw new UnsupportedOperationException();
		}
	}
	
}
