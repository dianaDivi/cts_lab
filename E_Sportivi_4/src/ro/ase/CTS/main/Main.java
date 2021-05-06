package ro.ase.CTS.main;

import ro.ase.CTS.clase.prototype.Client;

public class Main {

	public static void main(String[] args) {
		//La prototype avem doua instante diferite
		//Daca se mod Client1 atunci nu se mai modifica si Client2
		Client client=new Client("Gigel", 19, "Moldovean", 2333);
		Client client2=(Client) client.copiaza();
		
		System.out.println(client);
		System.out.println(client2);

	}

}
