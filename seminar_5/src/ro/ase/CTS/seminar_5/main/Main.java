package ro.ase.CTS.seminar_5.main;

import java.util.Scanner;

import ro.ase.CTS.seminar_5.Cart;
import ro.ase.CTS.seminar_5.factory.OfficeProduct;
import ro.ase.CTS.seminar_5.factory.Product;
import ro.ase.CTS.seminar_5.factory.TechProduct;

public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart=Cart.getInstance("shopping");
		
		Product smartphone=new TechProduct();
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
		
		
		
	}

}
