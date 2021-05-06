package ro.ase.CTS.ex7.Decorator;

public class Main {

	public static void main(String[] args) {
		Bilet bilet=new Bilet("SAS", "Catalin", "Boja");
		bilet.rezervaBilet();
		
		DecoratorConcretSustinere decoratorConcret=new DecoratorConcretSustinere(bilet);
		decoratorConcret.rezervaBilet();
		
		DecoratorConcret2LaMultiAni ani=new DecoratorConcret2LaMultiAni(bilet);
		ani.rezervaBilet();
		
		

	}

}
