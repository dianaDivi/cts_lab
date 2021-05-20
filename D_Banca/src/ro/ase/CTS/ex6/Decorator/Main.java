package ro.ase.CTS.ex6.Decorator;

public class Main {

	public static void main(String[] args) {
		IPlata iPlata=new EfectuarePlata(2, 300);
		iPlata.descrierePlata();
		
		DecoratorContactLess decoratorContactLess=new DecoratorContactLess(iPlata);
		decoratorContactLess.descrierePlata();
	}

}
