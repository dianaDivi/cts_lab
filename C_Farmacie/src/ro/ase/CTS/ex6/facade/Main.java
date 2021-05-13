package ro.ase.CTS.ex6.facade;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List< String >listaMedicamenteClient=new ArrayList<String>();
		listaMedicamenteClient.add("Paracetalol");
		listaMedicamenteClient.add("Chita");
		
		List<String> listaMedicamenteDisponibile=new ArrayList<String>();
		listaMedicamenteDisponibile.add("Paracetalol");
		listaMedicamenteDisponibile.add("Chita");
		List<String> listaMedicamenteDisponibile2=new ArrayList<String>();
		listaMedicamenteDisponibile.add("Paracetalol");
		listaMedicamenteDisponibile.add("Ghhh");
		listaMedicamenteDisponibile.add("Chita");
		boolean cardSanatate=true;
		
		
		Facade facade=new Facade();
		
	
		
		System.out.println(facade.verificareClient("Diana", listaMedicamenteClient,listaMedicamenteDisponibile, cardSanatate));
		System.out.println(facade.verificareClient("Diana", listaMedicamenteClient,listaMedicamenteDisponibile2, cardSanatate));
		System.out.println(facade.verificareClient("Diana", null,listaMedicamenteDisponibile, cardSanatate));

		boolean cardSanatate2=false;
		System.out.println(facade.verificareClient("Alina", null,  null,cardSanatate2));


	}

}
