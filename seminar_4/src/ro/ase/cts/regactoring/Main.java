package ro.ase.cts.regactoring;



public class Main {

	public static void main(String[] args) {
		Cart shoppingCart= Cart.getInstance("shoppingCart");
		Cart wishList=Cart.getInstance("wishList");
		Cart wishList2=Cart.getInstance("wishList");
		 shoppingCart.getProducts();
		 wishList.getProducts();
		 
		 EagherShoppingCartExample example1=EagherShoppingCartExample.INSTANCE;
		 
		 EagherShoppingCartExample example2=EagherShoppingCartExample.INSTANCE;

		 if(example1 == example2) {
			 System.out.println("obiectele sunt identice ");
		 }
		 
		 SingletonEnum mySingleton=SingletonEnum.INSTANCE;
		 mySingleton.getProoduct();

	}

}
