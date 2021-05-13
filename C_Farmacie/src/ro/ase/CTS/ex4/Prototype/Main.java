package ro.ase.CTS.ex4.Prototype;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap< String , Float> lista=new HashMap<String, Float>();
		lista.put("M",3f);
		lista.put("A",6f);
		lista.put("b",9f);
		
		Reteta reteta=new Reteta(3, lista);
		Reteta reteta2=(Reteta) reteta.copiaza();
		
		System.out.println(reteta.toString());
		System.out.println(reteta2.toString());
		
	}

}
