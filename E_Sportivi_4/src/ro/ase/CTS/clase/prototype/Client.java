package ro.ase.CTS.clase.prototype;

public class Client implements ClientProtopype {
 
	private String nume;
	private int varsta;
	private String nationalitate;
	private int codClient;
	
	
	
	public Client() {
		
	}

	public Client(String nume, int varsta, String nationalitate, int codClient) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.nationalitate = nationalitate;
		this.codClient = codClient;
	}
		
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", varsta=" + varsta + ", nationalitate=" + nationalitate + ", codClient="
				+ codClient + "]";
	}

	@Override
	public ClientProtopype copiaza() {
		Client client=new Client();
		client.nume=this.nume;
		client.varsta=this.varsta;
		client.nationalitate=this.nationalitate;
		client.codClient=this.codClient;
		return client;
		
	}
	
	
	
}
