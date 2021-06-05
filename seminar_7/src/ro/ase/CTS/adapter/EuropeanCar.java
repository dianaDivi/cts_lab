package ro.ase.CTS.adapter;

public class EuropeanCar {
	private String model;

	public EuropeanCar(String model) {
		super();
		this.model = model;
	}

	public abstract int getMaxSpeed();
}
