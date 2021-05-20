package ro.ase.CTS.ex7.Facade;

public class Client {
	private String numeClient;
	private int varsta;
	
	
	public Client(String numeClient, int varsta) {
		super();
		this.numeClient = numeClient;
		this.varsta = varsta;
	}
	public String getNumeClient() {
		return numeClient;
	}
	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [numeClient=");
		builder.append(numeClient);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	
}
