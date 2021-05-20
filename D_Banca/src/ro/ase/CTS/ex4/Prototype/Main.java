package ro.ase.CTS.ex4.Prototype;

public class Main {

	public static void main(String[] args) {
		Client client=new Client("Diana", 22);
		Client client2=(Client) client.copiaza();
		
		System.out.println(client);
		System.out.println(client2);}

}
