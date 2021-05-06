package ro.ase.CTS.ex2.SimpleFactory.clase;

public class Main {

	public static void main(String[] args) {
		FactoryPersonal factoryPersonal=new FactoryPersonal();
		PersonalSpital personalSpital=factoryPersonal.crearePersonal(TipPersonal.Brancardier, "Alin");
		System.out.println(personalSpital.toString());

	}

}
