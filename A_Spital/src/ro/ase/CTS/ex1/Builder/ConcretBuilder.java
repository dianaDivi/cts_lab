package ro.ase.CTS.ex1.Builder;

public class ConcretBuilder implements Builder{
	private String numePacient;
	private boolean patRabatabil;
	private boolean micDejunInclus;
	private boolean papuciDeCamera;
	private boolean halatPtInterior;
	public ConcretBuilder() {
		super();
		this.numePacient = "";
		this.patRabatabil = false;
		this.micDejunInclus = false;
		this.papuciDeCamera = false;
		this.halatPtInterior = false;
	}
	public ConcretBuilder setNumePacient(String numePacient) {
		this.numePacient = numePacient;
		return this;
	}
	public ConcretBuilder setPatRabatabil(boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
		return this;

	}
	public ConcretBuilder setMicDejunInclus(boolean micDejunInclus) {
		this.micDejunInclus = micDejunInclus;
		return this;

	}
	public ConcretBuilder setPapuciDeCamera(boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
		return this;

	}
	public ConcretBuilder setHalatPtInterior(boolean halatPtInterior) {
		this.halatPtInterior = halatPtInterior;
		return this;

	}
	@Override
	public Facilitati build() {
		return new Facilitati(numePacient, patRabatabil, micDejunInclus, papuciDeCamera, halatPtInterior);
	}
	
	
	
}
