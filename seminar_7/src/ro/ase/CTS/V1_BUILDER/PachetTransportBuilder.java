package ro.ase.CTS.V1_BUILDER;

public class PachetTransportBuilder implements Builder {
	private PachetTransport pachetTransport;
	
	
	

	public PachetTransportBuilder() {
		pachetTransport=new PachetTransport(false, false, false, false, false);
	}




	public PachetTransport build() {
		// TODO Auto-generated method stub
		return pachetTransport;
	}
	
	public PachetTransportBuilder setHasWiFi(boolean hasWIFI) {
		this.pachetTransport.setHasWIFI(hasWIFI);
		return this;
		
	}
	
	public PachetTransportBuilder setHasAnimale(boolean hasAnimale) {
		this.pachetTransport.setHasAnimale(hasAnimale);
		return this;
	}
	
	public PachetTransportBuilder setHasAC(boolean hasAC) {
		this.pachetTransport.setHasAC(hasAC);
		return this;
	}

	public PachetTransportBuilder setHasTV(boolean hasTV) {
		this.pachetTransport.setHasTV(hasTV);
		return this;
	}
	
	public PachetTransportBuilder setFumator(boolean isFumator) {
		this.pachetTransport.setFumator(isFumator);
		return this;
	}

}
