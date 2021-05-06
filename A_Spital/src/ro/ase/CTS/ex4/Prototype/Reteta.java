package ro.ase.CTS.ex4.Prototype;

import java.util.HashMap;

public class Reteta implements RetetaPrototype {
	private HashMap< String , Float> list=new HashMap<String, Float>();

	public Reteta() {
		
	}
	
	public Reteta(HashMap<String, Float> list) {
		super();
		this.list = list;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [list=");
		builder.append(list);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public RetetaPrototype copiaza() {
		Reteta reteta=new Reteta();
		reteta.list=this.list;
		return reteta;
	}
	
	
	
	
}
