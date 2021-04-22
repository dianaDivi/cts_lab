package ro.ase.CTS.main;

import ro.ase.CTS.clase.Factory;
import ro.ase.CTS.clase.FactoryPachetCazare;
import ro.ase.CTS.clase.FactoryPachetTRansport;
import ro.ase.CTS.clase.PachetTuristic;

public class Main {

	public static void main(String[] args) {
		Factory factory=new  FactoryPachetCazare();
		
		PachetTuristic pachetTuristic=factory.crearePachet();
		pachetTuristic.descriere();
		
	}

}
