package ro.ase.CTS.main;

import ro.ase.CTS.clase.Agentie;
import ro.ase.CTS.client.ClientFidel;

public class Main {

	public static void main(String[] args) {
		ClientFidel clientFidel=new ClientFidel("Popescu");
		ClientFidel clientFidel2=new ClientFidel("Diaconescu");
		ClientFidel clientFidel3=new ClientFidel("Vasilescu");
		
		Agentie agentie=new Agentie("Turr");
		
		agentie.adaugaObserver(clientFidel);
		agentie.adaugaObserver(clientFidel2);
		
		agentie.notificareOfertaNoua();
		agentie.adaugaObserver(clientFidel3);
		agentie.notificareReducerePret();


	}

}
