package ro.ase.CTS.E.ex3;

public class BuilderRezervareV2 implements BuilderAbstract{
	private int codRezervare; 
	private boolean areMancareInclusa;
	private boolean areauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzica;
	private String genMuzical;
	
	public BuilderRezervareV2() {
		super();
		this.codRezervare = 0;
		this.areMancareInclusa = false;
		this.areauturaInclusa = false;
		this.areScaunErgonomic = false;
		this.areMuzica = false;
		this.genMuzical = "";
	}

	public BuilderRezervareV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreauturaInclusa(boolean areauturaInclusa) {
		this.areauturaInclusa = areauturaInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public BuilderRezervareV2 setAreMuzica(boolean areMuzica) {
		this.areMuzica = areMuzica;
		return this;
	}

	public BuilderRezervareV2 setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
		return this;
	}

	@Override
	public Rezervare build() {
		return new Rezervare(codRezervare, areMancareInclusa, areauturaInclusa, areScaunErgonomic, areMuzica, genMuzical);
	}
	
	
	
}
