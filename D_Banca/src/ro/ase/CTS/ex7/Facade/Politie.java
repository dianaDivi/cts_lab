package ro.ase.CTS.ex7.Facade;

public class Politie {

	public static boolean isUrmarit(Client client) {
		return client.getVarsta() == 26;
	}
}
