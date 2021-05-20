package ro.ase.CTS.ex7.Facade;

public class Facade {
	public static boolean ifCreateCont(Client client) {
		if(!Politie.isUrmarit(client)) {
			System.out.println("Nu este urmarit");
			if(!Banca.haveCreante(client)) {
				
				System.out.println("Clientul mai are cont");
				if(client.getVarsta() >= 18) {
					
					System.out.println("are mai mult decat 18");
				}
			}
		}
		return false;
		
	}
		
}
