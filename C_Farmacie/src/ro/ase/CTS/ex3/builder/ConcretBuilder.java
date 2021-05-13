package ro.ase.CTS.ex3.builder;



public class ConcretBuilder implements IBuilder{
	private boolean numarPungi;
	private boolean plataCuCardul;
	private boolean cardFidelitate;
	private boolean cotaTVA;
	
	public ConcretBuilder() {
		super();
		this.numarPungi = false;
		this.plataCuCardul = false;
		this.cardFidelitate = false;
		this.cotaTVA = false;
	}

	public ConcretBuilder setNumarPungi(boolean numarPungi) {
		this.numarPungi = numarPungi;
		return this;
	}

	public ConcretBuilder setPlataCuCardul(boolean plataCuCardul) {
		this.plataCuCardul = plataCuCardul;
		return this;
	}

	public ConcretBuilder setCardFidelitate(boolean cardFidelitate) {
		this.cardFidelitate = cardFidelitate;
		return this;
	}

	public ConcretBuilder setCotaTVA(boolean cotaTVA) {
		this.cotaTVA = cotaTVA;
		return this;
	}

	@Override
	public Factura builder() {
		return new Factura(numarPungi, plataCuCardul, cardFidelitate, cotaTVA);
	}

}
