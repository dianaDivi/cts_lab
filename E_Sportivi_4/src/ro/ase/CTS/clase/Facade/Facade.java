package ro.ase.CTS.clase.Facade;

public class Facade {
	public static boolean sePermiteAccesulPeStadion(Persoana persoana, Bilet bilet) {
		if(persoana.getNume().equals(bilet.getNumeBilet())) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BazaDeDateHuligan.esteInListaDeHuligan(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
