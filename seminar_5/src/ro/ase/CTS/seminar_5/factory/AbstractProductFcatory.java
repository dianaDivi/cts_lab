package ro.ase.CTS.seminar_5.factory;

import java.security.PublicKey;

public abstract class AbstractProductFcatory {

	public abstract Product makeProduct() throws UnsupportedOperationException;
	
	public abstract String getCatalog();
}
