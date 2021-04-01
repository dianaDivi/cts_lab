package ro.ase.CTS.seminar_6.builder;

public class TechProduct implements Product{
	
	int id;
	String productName;
	String manufacturere;
	String model;
	String displayType;
	float price;
	
	
	private TechProduct() {
		
	}
//	
//	public TechProduct(int id) {
//		super();
//		this.id=id;
//	}


	public static class TechProductBuilder{
		private TechProduct product;
		product=new TechProduct();
		
	 public TechProductBuilder(int id) {
			
				this.id=id;
			
		}
	 public TechProductBuilder setName(String name) {
		 product.productName=name;
		 return this;
	 }
	 
	 public TechProductBuilder setManufacturer(String manufacturer) {
		 product.manufacturere=manufacturer;
		 return this;
	 }
	 
	 public TechProductBuilder setModel(String model) {
		 product.model=model;
		 return this;
	 }
	 
	 public TechProductBuilder setDisplayType(String displayTapy) {
		 product.displayType=displayTapy;
		 return this;
	 }
	 
	 public TechProductBuilder setPrice(float price) {
		 product.price=price;
		 return this;
	 }
	 
	 public TechProductBuilder getProduct() {
		 return product;
	 }
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getManufacturere() {
		return manufacturere;
	}

	public String getModel() {
		return model;
	}

	public String getDisplayType() {
		return displayType;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		
		return "this is my TechProduct";
	}

}
