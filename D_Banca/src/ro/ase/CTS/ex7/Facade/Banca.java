package ro.ase.CTS.ex7.Facade;

public class Banca {
	public static boolean haveCreante(Client client) {
		return client.getNumeClient().length()==3;
	}
}
