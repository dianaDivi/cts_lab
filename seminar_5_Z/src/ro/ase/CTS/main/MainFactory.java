package ro.ase.CTS.main;

import ro.ase.CTS.MethodFactory.clase.FactoryAtacant;
import ro.ase.CTS.MethodFactory.clase.FactoryMijlocas;
import ro.ase.CTS.MethodFactory.clase.Jucator;
import ro.ase.CTS.MethodFactory.clase.JucatorFactory;


public class MainFactory {
	public static  void afiseaza(JucatorFactory jucatorFactory, String numeJucator) {
		Jucator jucator=jucatorFactory.creareJucator(numeJucator);
		System.out.println(jucator.toString());
	}

	public static void main(String[] args) {
		afiseaza(new FactoryAtacant(),"Andrei");
		afiseaza(new FactoryMijlocas(), "Ana");
	}

}
