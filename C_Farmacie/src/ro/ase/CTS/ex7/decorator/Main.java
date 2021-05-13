package ro.ase.CTS.ex7.decorator;

public class Main {

	public static void main(String[] args) {
		Bon bon=new Bon(1, 22, 303);
		bon.afisareBon();
		
		DecoratorBon decoratorBon=new DecoratorBon(bon);
		decoratorBon.afisareBon();
		
	}

}
