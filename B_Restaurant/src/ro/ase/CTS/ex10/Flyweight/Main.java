package ro.ase.CTS.ex10.Flyweight;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(1, 2, 15);
		Rezervare rezervare2=new Rezervare(8, 2, 1);
		Rezervare rezervare3=new Rezervare(5, 20, 12);
		
		FabricaFlyweight fabricaFlyweight=new FabricaFlyweight();
		Client client=(Client) fabricaFlyweight.getClient("Dia");
		client.afisareInformatii(rezervare);
		
		
		Client client2=(Client) fabricaFlyweight.getClient("Vlada");
		client2.afisareInformatii(rezervare2);
		
		fabricaFlyweight.getClient("Vlada").afisareInformatii(rezervare3);
		
		
		

	}

}
