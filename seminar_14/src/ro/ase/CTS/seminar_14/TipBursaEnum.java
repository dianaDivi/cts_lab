package ro.ase.CTS.seminar_14;

public enum TipBursaEnum {
	MERIT(500), EXCELENTA(1000);

	int cuantum;

	TipBursaEnum(int cuantum) {
		this.cuantum = cuantum;
	}

	public int getCuantum() {
		return this.cuantum;
	}
}
