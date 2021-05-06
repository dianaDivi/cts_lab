package ro.ase.CTS.ex8.Composite;

public class Main {

	public static void main(String[] args) {
		ComponentaMeniu meniu=new Sectiune("Meniu");
		
		
		ComponentaMeniu sectiuneDesert=new Sectiune("Desert");
		ComponentaMeniu sectiuneBauturi=new Sectiune("Bauturi");
		Item itemCeai=new Item("Ceai");
		Item itemTiramisu=new Item("Tiramisu");
		Item itemCafea=new Item("Cafea");
		
		meniu.adaugaNod(sectiuneBauturi);
		meniu.adaugaNod(sectiuneDesert);
	
		sectiuneBauturi.adaugaNod(itemCafea);
		sectiuneBauturi.adaugaNod(itemCafea);

		sectiuneBauturi.adaugaNod(itemCeai);
		
		sectiuneDesert.adaugaNod(itemTiramisu);
		
		sectiuneBauturi.stergeNod(itemCafea);
	
		
		meniu.afiseazaInformatii();
		

	}

}
