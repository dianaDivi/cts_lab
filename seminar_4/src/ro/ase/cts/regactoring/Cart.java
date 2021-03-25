package ro.ase.cts.regactoring;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart implements Serializable {

	
	private static Map<String, Cart> instances=null;
	private String type;
	public ArrayList<String> products;
	
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

	
	public ArrayList<String>getProducts(){
		return products;
	}
	
}
