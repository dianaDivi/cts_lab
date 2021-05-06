package ro.ase.CTS.main;

import ro.ase.CTS.simpleFcatory.clase.Jucator;
import ro.ase.CTS.simpleFcatory.clase.JucatorFactory;
import ro.ase.CTS.simpleFcatory.clase.TipJucator;

public class MainSimpleFcatory {

	public static void main(String[] args) {
		
		
		try {
			Jucator jucator1=JucatorFactory.creareJucator(TipJucator.Atacant, "Claw");
			Jucator jucator2=JucatorFactory.creareJucator(TipJucator.Atacant, "V");
			System.out.println(jucator1.toString());
			System.out.println(jucator2.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
