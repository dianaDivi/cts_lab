package ro.ase.CTS.ex12.Observer;

public class ClientAbonat implements Observer{
	private String numeClient;

	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}

	public String getNumeClient() {
		return numeClient;
	}

	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}

	@Override
	public String toString() {
		return "Client [numeClient=" + numeClient + "]";
	}

	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println("Client [numeClient=" + numeClient + "]" +" primeste mesajul "+mesaj );
	}
	
	
}
