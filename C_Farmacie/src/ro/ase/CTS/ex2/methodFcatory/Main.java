package ro.ase.CTS.ex2.methodFcatory;

public class Main {
	public static void afisare(FactoryMedicamente factoryMedicamente, String nume, float pret) {
		Medicamente medicamente=factoryMedicamente.creareMedicament(nume, pret);
		System.out.println(medicamente.toString());
	}

	public static void main(String[] args) {
		afisare(new FactoryBody(), "Cap", 33);
		afisare(new FactoryDurere(), "Paracetamol", 22);
		afisare(new FactoryRaceala(), "Teraflu", 21);

	}

}
