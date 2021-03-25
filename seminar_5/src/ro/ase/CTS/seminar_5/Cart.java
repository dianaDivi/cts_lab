package ro.ase.CTS.seminar_5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ro.ase.CTS.seminar_5.factory.Product;

public class Cart implements Serializable {

	
	private static Map<String, Cart> instances=null;
	private String type;
	public ArrayList<Product> products;
	
	private Cart() {
		
		products=new ArrayList<>();
	}

	public static synchronized Cart getInstance(String type) {
		if(instances == null) {
			instances =new HashMap<>();
			
		}
		 
		if(instances.containsKey(type)) {
			return instances.get(type);
		}
		if(!instances.containsKey(type)){
			Cart mycart=new Cart();
			mycart.type=type;
			instances.put(type, mycart);
		}
		 return instances.get(type);
	}

	
	public ArrayList<Product>getProducts(){
		return products;
	}
	
}
