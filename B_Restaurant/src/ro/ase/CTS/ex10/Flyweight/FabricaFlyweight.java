package ro.ase.CTS.ex10.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
	private Map<String, Flyweight> clienti;

	public FabricaFlyweight() {
		super();
		this.clienti = new HashMap<String, Flyweight>() ;
	};
	
	public Flyweight getClient(String numeClient) {
		Client client= (Client) clienti.get(numeClient);
		if(client == null) {
			client=new Client(numeClient, "0333", "Dug_Diana");
			clienti.put(numeClient, client);
		}
			return client;
	}
	
}
