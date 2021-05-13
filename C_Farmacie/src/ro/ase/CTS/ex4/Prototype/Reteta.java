package ro.ase.CTS.ex4.Prototype;

import java.util.HashMap;

public class Reteta implements RetatapPrototype {
	private int codReteta;
	private HashMap<String , Float>cantitateSolutii=new HashMap<>();
	
	public Reteta () {
		
	}
	
	public Reteta(int codReteta, HashMap<String, Float> cantitateSolutii) {
		super();
		this.codReteta = codReteta;
		this.cantitateSolutii = cantitateSolutii;
	}

	public int getCodReteta() {
		return codReteta;
	}

	public void setCodReteta(int codReteta) {
		this.codReteta = codReteta;
	}

	public HashMap<String, Float> getCantitateSolutii() {
		return cantitateSolutii;
	}

	public void setCantitateSolutii(HashMap<String, Float> cantitateSolutii) {
		this.cantitateSolutii = cantitateSolutii;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [codReteta=");
		builder.append(codReteta);
		builder.append(", cantitateSolutii=");
		builder.append(cantitateSolutii);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public RetatapPrototype copiaza() {
		Reteta reteta=new Reteta();
		reteta.cantitateSolutii=this.cantitateSolutii;
		reteta.codReteta=this.codReteta;
		return reteta;
	}
	
	
}
