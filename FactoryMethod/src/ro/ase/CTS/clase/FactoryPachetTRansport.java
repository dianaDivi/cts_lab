package ro.ase.CTS.clase;

public class FactoryPachetTRansport implements Factory{

	@Override
	public PachetTuristic crearePachet() {
		return new PachetTransport();
	}

}
