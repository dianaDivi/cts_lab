package ro.ase.CTS.ex15.Command_Z;

public class ContBancar {
	private String destinator;
	private float sold;
	
	public ContBancar(String destinator) {
		super();
		this.destinator = destinator;
		this.sold = 0;
	}
	
	public void constituire(float suma) {
		System.out.println("Contul a fost constituit cu:" +suma);
		sold=suma;
	}
	
	
	public void retragere(float suma) {
		if(suma <=sold) {
			System.out.println("Din cont a fost retrasa suma de: "+suma);
			sold=sold-suma;

		}else {
			System.out.println("Suma este prea mare");
		}
	}
	
	public void depunere(float suma) {
		System.out.println("In const a dost depusa suma:"+suma);
		sold+=suma;
	}
	
}
