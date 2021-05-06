package ro.ase.CTS.ex3.MethodFactory;

public class Main {
	public static void afisare(FactoryPersonalSpital factoryPersonalSpital, String numePersonal)
	{
		PersonalSpital personalSpital=factoryPersonalSpital.creare(numePersonal);
		System.out.println(personalSpital);
	}
	
	public static void main(String[] args) {
		afisare(new FactoryAsistent(), "hhhh");
	}

}
