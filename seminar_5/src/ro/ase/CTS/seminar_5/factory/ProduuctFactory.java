package ro.ase.CTS.seminar_5.factory;

public class ProduuctFactory {

	public Product makePorduct(String type) {
		if(type.equalsIgnoreCase("tech")) {
			return new  TechProduct();
		}else if(type.equalsIgnoreCase("office")) {
			return new OfficeProduct();
		}else {
			throw new UnsupportedOperationException();
		}
	}
	
}
