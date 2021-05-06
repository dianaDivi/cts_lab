package ro.ase.CTS.ex1.Builder;

public class Facilitati {
	private String numePacient;
	private boolean patRabatabil;
	private boolean micDejunInclus;
	private boolean papuciDeCamera;
	private boolean halatPtInterior;
	


	public Facilitati(String numePacient, boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera,
			boolean halatPtInterior) {
		super();
		this.numePacient = numePacient;
		this.patRabatabil = patRabatabil;
		this.micDejunInclus = micDejunInclus;
		this.papuciDeCamera = papuciDeCamera;
		this.halatPtInterior = halatPtInterior;
	}

	public void setNumePacient(String numePacient) {
		this.numePacient = numePacient;
	}

	public void setPatRabatabil(boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}

	public void setMicDejunInclus(boolean micDejunInclus) {
		this.micDejunInclus = micDejunInclus;
	}

	public void setPapuciDeCamera(boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}

	public void setHalatPtInterior(boolean halatPtInterior) {
		this.halatPtInterior = halatPtInterior;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Facilitati [numePacient=");
		builder.append(numePacient);
		builder.append(", patRabatabil=");
		builder.append(patRabatabil);
		builder.append(", micDejunInclus=");
		builder.append(micDejunInclus);
		builder.append(", papuciDeCamera=");
		builder.append(papuciDeCamera);
		builder.append(", halatPtInterior=");
		builder.append(halatPtInterior);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
