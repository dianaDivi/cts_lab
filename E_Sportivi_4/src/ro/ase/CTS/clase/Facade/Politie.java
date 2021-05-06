package ro.ase.CTS.clase.Facade;

public class Politie {

	public static boolean esteUrmarit(Persoana persoana) {
		return Integer.parseInt(""+persoana.getCNP().charAt(12))%2 ==0;
	}
}
