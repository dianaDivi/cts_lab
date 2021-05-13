package ro.ase.CTS.Flyweight;

import java.util.HashMap;

public class FabricaDePachete {
	private HashMap<Integer, IPachetTuristic>pacheteTuristice;

	public FabricaDePachete() {
		super();
		this.pacheteTuristice = new HashMap<Integer, IPachetTuristic>();
	}
	
	
	public int getNumarPachete() {
		return this.pacheteTuristice.size();
	}
	
	public IPachetTuristic getPachetTuristic(int codPachet) {
		IPachetTuristic pachet=pacheteTuristice.get(codPachet);
		
		if(pachet==null) {
			pachet=new PachetTuristic(codPachet, "Hptel", "BB", true);
			pacheteTuristice.put(codPachet, pachet);
		}
		return pachet;
		
	}
	
	
}