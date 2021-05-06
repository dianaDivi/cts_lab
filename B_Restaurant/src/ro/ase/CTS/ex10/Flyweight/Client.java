package ro.ase.CTS.ex10.Flyweight;

public class Client implements  Flyweight{
	private String numeClient;
	private String nrTelefon;
	private String email;
	
	
	public Client(String numeClient, String nrTelefon, String email) {
		super();
		this.numeClient = numeClient;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [numeClient=");
		builder.append(numeClient);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void afisareInformatii(Rezervare rezervare) {
		System.out.println(this.toString()+ rezervare.toString());
	}
	
}
