package ro.ase.CTS_factory.clase;

public class AgentieSingletonFcatory {

	private AgentieSingletonFcatory() {
		
	}
	
	private static AgentieSingletonFcatory instanta=null;
	
	public static synchronized AgentieSingletonFcatory getInstanta() {
		if(instanta==null) {
			instanta=new AgentieSingletonFcatory();
		}
		
		return instanta;
	}
	
	public PachetTuristic createPachet(TipPachet tipPachet) {
		switch (tipPachet) {
		case pachetCazare:
			return new PachetCazare();
		case pachetTransport:
			return new PachetTransport();
		case pachetCazareTransport:
			return new PachetTuristicCazare();
		case pachetAllInclusiv:
			return new PachetAllInclusiv();
		default:
			break;
		}
		return null;
	}
}
