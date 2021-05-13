package ro.ase.CTS.ex1.simpleFactory;

public class Main {

	public static void main(String[] args) {
		FactoryMedicamente factoryMedicamente=new FactoryMedicamente();
		
		Medicament medicament= factoryMedicamente.creareMedicament(EnumCategorie.Durere, "Paracetamol", 4);
		Medicament medicament2=factoryMedicamente.creareMedicament(EnumCategorie.Body, "Girovel", 22);
		Medicament medicament3=factoryMedicamente.creareMedicament(EnumCategorie.Raceala, "Teraflu", 43);
		
		System.out.println(medicament.toString());
		System.out.println(medicament2.toString());
		System.out.println(medicament3.toString());

	}

}
