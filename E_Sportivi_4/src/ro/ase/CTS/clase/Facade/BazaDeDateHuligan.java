package ro.ase.CTS.clase.Facade;

public class BazaDeDateHuligan {
	public static boolean esteInListaDeHuligan(Persoana persoana) {
		return Integer.parseInt(""+persoana.getCNP().charAt(11))%2 ==0;

	}

}
