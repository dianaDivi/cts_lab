package ro.ase.CTS.ex9.Proxy;

public class Main {

	public static void main(String[] args) {
		OperatoriRezervare operatoriRezervare=new OperatoriRezervare("MammaLeone");
		operatoriRezervare.rezervare(2);
		
		Proxi proxi=new Proxi(operatoriRezervare, 3);
		proxi.rezervare(2);
	}
}



