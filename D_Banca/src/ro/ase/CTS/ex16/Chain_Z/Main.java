package ro.ase.CTS.ex16.Chain_Z;

public class Main {

	public static void main(String[] args) {
		ContCurent contCurent=new ContCurent("Diana", 22);
		ContEconomii contEconomii=new ContEconomii("Diana", 100);
		ContIndisponibil contIndisponibil=new ContIndisponibil("Diana");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contIndisponibil);

		contCurent.realizarePlata(10);
		contCurent.realizarePlata(99);
		contCurent.realizarePlata(120);

	}

}
