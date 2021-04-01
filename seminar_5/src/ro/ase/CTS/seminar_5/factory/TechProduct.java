package ro.ase.CTS.seminar_5.factory;

public class TechProduct implements Product{
	
	String manufacturere;
	String model;
	String displayType;
	float price;
	String productName;
	
	private TechProduct() {
		// TODO Auto-generated constructor stub
	}
	

	
	public TechProduct(String productName) {
		super();
		this.productName = productName;
	}




	@Override
	public String getDescription() {
		
		return "this is my TechProduct";
	}

}
