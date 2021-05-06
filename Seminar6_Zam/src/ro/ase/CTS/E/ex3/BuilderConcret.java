package ro.ase.CTS.E.ex3;

public class BuilderConcret implements BuilderAbstract {
	private Rezervare rezervare;
	
	public BuilderConcret() {
		super();
		this.rezervare = new Rezervare(0, false, false, false, false, "Clasica");
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}

	
	public BuilderConcret setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return  this;
	}

	public BuilderConcret setAreMancareInclusa(boolean areMancareInclusa) {
		 rezervare.setAreMancareInclusa(areMancareInclusa);
		 return  this;
	}

	public BuilderConcret setAreauturaInclusa(boolean areauturaInclusa) {
		rezervare.setAreauturaInclusa(areauturaInclusa);
		return  this;
	}

	
	public BuilderConcret setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return  this;
	}
	
	public BuilderConcret setAreMuzica(boolean areMuzica) {
		rezervare.setAreMuzica(areMuzica);
		return  this;
	}

	
	public BuilderConcret setGenMuzical(String genMuzical) {
		rezervare.setGenMuzical(genMuzical);
		return  this;
	}
}
