package ro.ase.CTS.ex2.MethodFactory;

public class Main {

	public static void main(String[] args) {
		FactoroCredit factoroCredit=new FactoryCrediteIpoptecare();
		ICredit credit=factoroCredit.creareCredit();
		credit.descriere();

	}

}
