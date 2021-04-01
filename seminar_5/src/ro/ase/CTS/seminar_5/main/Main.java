package ro.ase.CTS.seminar_5.main;

import java.util.Scanner;

import ro.ase.CTS.seminar_5.Cart;
import ro.ase.CTS.seminar_5.factory.AbstractProductFcatory;
import ro.ase.CTS.seminar_5.factory.OfficeProduct;
import ro.ase.CTS.seminar_5.factory.Product;
import ro.ase.CTS.seminar_5.factory.TechProdactFcatory;
import ro.ase.CTS.seminar_5.factory.TechProduct;

public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart=Cart.getInstance("shopping");
		
		
		Product paperClip=new OfficeProduct();
		
		myShoppingCart.products.add(smartphone);
		myShoppingCart.products.add(paperClip);
		
		Scanner scan=new Scanner(System.in) {
			System.out.println("Catalogul");
			String usersPreference=scan.nextLine();
			Product myProduct=null;
			
		}
		
		for(Product p: myShoppingCart.products) {
			System.out.println(p.getDescription());
		}
		
		
Cart myShoppingCart = Cart.getInstance("shopping");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("selectati categoria produse:\ntech - Produse tech \n office - Produse office");
		String userPreference = scan.nextLine();
		Product myProduct = null;
		
		AbstractProductFcatory productFactory=null;
		if(userPreference!=null) {
			if(userPreference.equalsIgnoreCase("tech")) {
				productFactory=new TechProdactFcatory();
			}
			
		}
		myProduct=productFactory.makeProduct();
			

		
//		}else {
//			System.out.println("Optiune invalida.");
//			System.out.println("Catalog produse:\ntech - Produse tech \n office - Produse office");
//		}
		
	}

}
