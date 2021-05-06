package ro.ase.CTS.ex4.Prototype;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap< String, Float> list=new HashMap<String,Float>();
		list.put("medic", 4.3f);
		list.put("bdd", 32.3f);
		list.put("sss", 4f);
		
		Reteta reteta=new Reteta(list);
		System.out.println(reteta);
		
		Reteta reteta2=(Reteta) reteta.copiaza();
		System.out.println(reteta2);

	}

}
