package ro.ase.CTS.seminar_5;

import java.util.ArrayList;

public enum SingletonEnum {
	INSTANCE;
	
	public ArrayList<String> products;
	
	public ArrayList<String> getProoduct(){
		if(products == null) {
			products=new ArrayList<String>();
		}
		return products;
	}
	
}
