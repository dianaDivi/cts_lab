package ro.ase.CTS.ex4.Prototype;

public class Client implements IClient{
	private String nume;
	private int varsta;
	
	
	public Client() {
		super();
	}


	public Client(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}


	@Override
	public String toString() {
		return "Client [nume=" + nume + ", varsta=" + varsta + "]";
	}


	@Override
	public IClient copiaza() {
		Client client=new Client();
		client.nume=this.nume;
		client.varsta=this.varsta;
		
		return client;
	}

}
