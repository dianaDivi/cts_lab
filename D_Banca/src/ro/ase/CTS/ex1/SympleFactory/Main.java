package ro.ase.CTS.ex1.SympleFactory;


public class Main {
	public static void afisare(FactoryCredit factoryCredit, EnumCredite enumCredite) {
		ICredit iCredit=factoryCredit.creareCredit(enumCredite);
		iCredit.descriere();
	}

	public static void main(String[] args) {
		FactoryCredit creditFactory=new FactoryCredit();
		ICredit credit=creditFactory.creareCredit(EnumCredite.CreditIpotecar);
		credit.descriere();
		
		afisare(new FactoryCredit(), EnumCredite.NefoiPersonale);
		afisare(new FactoryCredit(), EnumCredite.CreditIpotecar);
	}

}
