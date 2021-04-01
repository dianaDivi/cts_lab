package ro.ase.CTS.Main;

import ro.ase.CTS.clase.PachetCazare;
import ro.ase.CTS.clase.PachetTransport;
import ro.ase.CTS.clase.RegistryPachete;

public class Main {

	public static void main(String[] args) {
		PachetCazare cazare=new PachetCazare();
		PachetCazare cazare2=new PachetCazare();
		PachetTransport transport=new PachetTransport();
		
		try {
			RegistryPachete.register("Cazare", cazare);
		
			RegistryPachete.register("Transport", transport);

			RegistryPachete.getPachet("Cazare").descriere();
		
			RegistryPachete.getPachet("Transport").descriere();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
