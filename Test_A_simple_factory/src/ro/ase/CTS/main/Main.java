package ro.ase.CTS.main;

import ro.ase.CTS.clase.CrearePersonal;
import ro.ase.CTS.clase.PersonalSpital;
import ro.ase.CTS.clase.TipPersonalSpital;

public class Main {

	public static void main(String[] args) throws Exception {
		CrearePersonal crearePersonal = new CrearePersonal();
		try {
			PersonalSpital personalSpital = crearePersonal.creareInstanta(TipPersonalSpital.Medic);
			personalSpital.descriere();
			
			PersonalSpital personalSpital2 = crearePersonal.creareInstanta(TipPersonalSpital.Brancardier);
			personalSpital2.descriere();
			
			PersonalSpital personalSpital3 = crearePersonal.creareInstanta(TipPersonalSpital.Asistent);
			personalSpital3.descriere();
			
	

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
