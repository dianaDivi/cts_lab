package ro.ase.cts.regactoring;

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
