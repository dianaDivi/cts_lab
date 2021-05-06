package ro.ase.CTS.ex8.Composite;

public class Main {

	public static void main(String[] args) {
		ComponentaSpital componentaSpital=new Departament("Spital");
		
		ComponentaSpital copii=new Departament("Copii");
		ComponentaSpital maturi=new Departament("Maturi");
		
		componentaSpital.adaugaNod(copii);
		componentaSpital.adaugaNod(maturi);

		Sectie pediatrie=new Sectie("Pediatrie");
		Sectie genecologie=new Sectie("Genecologie");
		Sectie cardiologie=new Sectie("Cardiologie");
		
		copii.adaugaNod(pediatrie);
		maturi.adaugaNod(cardiologie);
		maturi.adaugaNod(genecologie);
		
		componentaSpital.afisareInformatii();
	}

}
