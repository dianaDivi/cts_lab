package ro.ase.CTS.clase.Facade;

public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Andrei", "3746384950283");
		Bilet bilet=new Bilet("Andrei", 3);
		
		//verifica daca biletul este persoana respectiva
		if(persoana.getNume().equals(bilet.getNumeBilet())) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BazaDeDateHuligan.esteInListaDeHuligan(persoana)) {
					System.out.println("Va rugam intrati");
				}else {
					System.out.println("Nu intra");
				}
			}
		}
		
		if(Facade.sePermiteAccesulPeStadion(persoana, bilet)) {
			System.out.println("S-a acceptat");
		}else {
			System.out.println("Nu");
		}
		
	}

}
