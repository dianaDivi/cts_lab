package ro.ase.CTS.ex3.builder;

public class Main {

	public static void main(String[] args) {
		Factura factura=new ConcretBuilder().setCardFidelitate(true).setNumarPungi(true).builder();
		System.out.println(factura.toString());
		
	}

}
