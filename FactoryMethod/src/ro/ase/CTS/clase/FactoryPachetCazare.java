package ro.ase.CTS.clase;

public class FactoryPachetCazare implements Factory {

	@Override
	public PachetTuristic crearePachet() {
		
		return new PachetCazare();
	}

}
