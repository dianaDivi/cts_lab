package ro.ase.cts.regactoring;

public class ShoppingCart {

	static private ShoppingCart instance;
	
	private ShoppingCart() {}

	public static ShoppingCart getInstance() {
		if(instance == null) {
			instance=new ShoppingCart();
		}
		 
		 return instance;
	}

	
	
	
}
