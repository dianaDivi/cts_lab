package ro.ase.CTS.clase;

public class FcatoryCazareTransport implements Factory{

	@Override
	public PachetTuristic crearePachet() {
		// TODO Auto-generated method stub
		return new PachetCazareTransport();
	}

}
