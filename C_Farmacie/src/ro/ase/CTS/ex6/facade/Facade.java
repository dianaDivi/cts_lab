package ro.ase.CTS.ex6.facade;

import java.util.List;

public class Facade {
	public static String verificareClient(String numeClient, List<String> listaMedicamenteClient, List<String> listaMedicamenteDisponibile ,boolean cardSanatate) {
		CardulDeSanatate cardulDeSanatate=new CardulDeSanatate(cardSanatate);
		if(cardulDeSanatate.isCardSanatate()) {
			RetetaClient retetaClient=new RetetaClient(numeClient, listaMedicamenteClient);
			if(listaMedicamenteClient!= null) {
				
				//return "Detine card de sanatate persoana detine lista de medicamente" ;
				DisponibilitateaMedicamentelor medicamentelor=new DisponibilitateaMedicamentelor(listaMedicamenteDisponibile);
				if(listaMedicamenteClient.size()==listaMedicamenteDisponibile.size()) {
					return "Clientul "+numeClient +" detine card se sanatate "+" lista de medicamnete sunt in depozit ";
					
				}
				return "Clientul "+numeClient +" detine card se sanatate "+" lista de medicamnete nu sunt in depozit ";

				
			}else {
				
				return "Clientul: " +numeClient+" detine card de sanatate si nu are o lista de medicamente";
			}
			
		}else {
			return "Clientul: "+numeClient+" nu detine card de sanatate";
		}
	}

}
