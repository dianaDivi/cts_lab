package ro.ase.CTS.main;

import ro.ase.CTS.clase.Rezervare;
import ro.ase.CTS.clase.Stare;
import ro.ase.CTS.clase.StareEfectuata;
import ro.ase.CTS.clase.StareNeplatit;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rezervare rezervare=new Rezervare(1);
		
		StareNeplatit neplatit=new StareNeplatit();
		neplatit.doAction(rezervare);
		System.out.println(rezervare.getStare());
		
		StareEfectuata efectuata=new StareEfectuata();
		efectuata.doAction(rezervare);
		System.out.println(rezervare.getStare());
	}

}
