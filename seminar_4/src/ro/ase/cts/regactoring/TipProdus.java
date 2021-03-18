package ro.ase.cts.regactoring;

public enum TipProdus {
NOU(0),
DISCOUNT(0.1f),
STOC_LIMITAT(0.25f),
SFARSIT_DE_STOC(0.35f),

	private float discount;
	
	public TipProdus(float discount) {
		this.discount=discount;
	}
	
	public float getDiscount() {
		return this.discount;
	}
}


