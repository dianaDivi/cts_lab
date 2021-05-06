package ro.ase.CTS.clase;

public class Main {
	public static void afisare(FactoryPersonal factoryPersonal, String nume ) {
		PersonalSpital personalSpital=factoryPersonal.crearePersonal(nume);
		System.out.println(personalSpital.toString());
	}

	public static void main(String[] args) {
	afisare(new MedicFactory(), "Gigel");

	}

}
