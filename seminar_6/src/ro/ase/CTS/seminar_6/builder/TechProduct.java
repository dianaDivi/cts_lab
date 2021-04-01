package ro.ase.CTS.seminar_6.builder;

public class TechProduct implements Product{
	
	int id;
	String productName;
	String manufacturere;
	String model;
	String displayType;
	float price;
	
	
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
