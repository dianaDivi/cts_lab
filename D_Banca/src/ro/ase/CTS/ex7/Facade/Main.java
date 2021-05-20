package ro.ase.CTS.ex7.Facade;

public class Main {


	public static void main(String[] args) {
		Client client=new Client("Ion", 26);
		Facade facade=new Facade();
		boolean t=facade.ifCreateCont(client);
		Cont cont;
		
		if(t) {
			cont=new Cont(client.getNumeClient(), "02222");
			System.out.println(cont.toString());
		}else {
			System.out.println("Clientul este invalid");
		}
		
		
		
	}

}
