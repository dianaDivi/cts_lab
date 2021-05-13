package ro.ase.CTS.ex8.composite;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ComponentaMedicamente structuraArborescenta=new Sectiune("Sectiune");
		
		ComponentaMedicamente raceala=new Sectiune("Raceala");
		ComponentaMedicamente durere=new Sectiune("Durere");
		ComponentaMedicamente antibiotice=new Sectiune("Antibiotice");
		
		ComponentaMedicamente adulti=new Sectiune("Adulti");
		ComponentaMedicamente copii=new Sectiune("Copii");
		
		structuraArborescenta.adaugaNod(raceala);
		structuraArborescenta.adaugaNod(durere);
		structuraArborescenta.adaugaNod(antibiotice);
		
		raceala.adaugaNod(copii);
		raceala.adaugaNod(adulti);
		
		Item gripovit=new Item("Gripovit");
		Item nurofen=new Item("Nurofen");
		
		adulti.adaugaNod(gripovit);
		copii.adaugaNod(nurofen);
		
		
		antibiotice.adaugaNod(copii);
		antibiotice.adaugaNod(adulti);
		
		structuraArborescenta.afiseazaInformatii();

	}

}
