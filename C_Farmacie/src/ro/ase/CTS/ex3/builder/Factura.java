package ro.ase.CTS.ex3.builder;

public class Factura {
	private boolean numarPungi;
	private boolean plataCuCardul;
	private boolean cardFidelitate;
	private boolean cotaTVA;
		
	public Factura(boolean numarPungi, boolean plataCuCardul, boolean cardFidelitate, boolean cotaTVA) {
		super();
		this.numarPungi = numarPungi;
		this.plataCuCardul = plataCuCardul;
		this.cardFidelitate = cardFidelitate;
		this.cotaTVA = cotaTVA;
	}

	public boolean isNumarPungi() {
		return numarPungi;
	}

	public void setNumarPungi(boolean numarPungi) {
		this.numarPungi = numarPungi;
	}

	public boolean isPlataCuCardul() {
		return plataCuCardul;
	}

	public void setPlataCuCardul(boolean plataCuCardul) {
		this.plataCuCardul = plataCuCardul;
	}

	public boolean isCardFidelitate() {
		return cardFidelitate;
	}

	public void setCardFidelitate(boolean cardFidelitate) {
		this.cardFidelitate = cardFidelitate;
	}

	public boolean isCotaTVA() {
		return cotaTVA;
	}

	public void setCotaTVA(boolean cotaTVA) {
		this.cotaTVA = cotaTVA;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Factura [numarPungi=");
		builder.append(numarPungi);
		builder.append(", plataCuCardul=");
		builder.append(plataCuCardul);
		builder.append(", cardFidelitate=");
		builder.append(cardFidelitate);
		builder.append(", cotaTVA=");
		builder.append(cotaTVA);
		builder.append("]");
		return builder.toString();
	}
	
}
