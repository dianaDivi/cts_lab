package ro.ase.CTS_factory.clase;

public class AgentieFactory {

	
	public PachetTuristic createPachet (TipPachet tipPachet)throws Exception{
		switch (tipPachet) {
		case pachetCazare:
			return new PachetCazare();
		case pachetTransport:
			return new PachetTransport();
		case pachetCazareTransport:
			return new PachetTuristicCazare();
		default:
			break;
		}
		return null;
	}
}
