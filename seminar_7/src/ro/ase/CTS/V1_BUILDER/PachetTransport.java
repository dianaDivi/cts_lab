package ro.ase.CTS.V1_BUILDER;

public class PachetTransport {

	private boolean hasWIFI;
	private boolean hasAnimale;
	private boolean hasAC;
	private boolean hasTV;
	private boolean isFumator;


	
	
	public PachetTransport(boolean hasWIFI2, boolean hasAnimale2, boolean hasAC2, boolean hasTV2, boolean isFumator2) {
		super();
		this.hasWIFI = hasWIFI2;
		this.hasAnimale = hasAnimale2;
		this.hasAC = hasAC2;
		this.hasTV = hasTV2;
		this.isFumator = isFumator2;
	}



	public boolean isHasWIFI() {
		return hasWIFI;
	}
	
	public void setHasWIFI(boolean hasWIFI) {
		this.hasWIFI = hasWIFI;
	}
	
	public boolean isHasAnimale() {
		return hasAnimale;
	}
	
	public void setHasAnimale(boolean hasAnimale) {
		this.hasAnimale = hasAnimale;
	}
	
	public boolean isHasAC() {
		return hasAC;
	}
	
	public void setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}
	
	public boolean isHasTV() {
		return hasTV;
	}
	
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	
	public boolean isFumator() {
		return isFumator;
	}
	
	public void setFumator(boolean isFumator) {
		this.isFumator = isFumator;
	}
	
	@Override
	public String toString() {
		return "PachetTransport [hasWIFI=" + hasWIFI + ", hasAnimale=" + hasAnimale + ", hasAC=" + hasAC + ", hasTV="
				+ hasTV + ", isFumator=" + isFumator + "]";
	}
	
	
}
