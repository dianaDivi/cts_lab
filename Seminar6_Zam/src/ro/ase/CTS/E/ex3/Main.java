package ro.ase.CTS.E.ex3;

public class Main {

	public static void main(String[] args) {
		//prima varianta
		BuilderConcret builderConcret=new BuilderConcret();
		Rezervare rezervare=builderConcret.setAreauturaInclusa(true).build();
		
		BuilderConcret builderConcret2=new BuilderConcret();
		Rezervare rezervare2=builderConcret2.setAreMancareInclusa(true).build();
		
		System.out.println(rezervare);
		System.out.println(rezervare2);
		
		//varianta a doua a unui Builder

		Rezervare rezervare3=new BuilderRezervareV2().setAreauturaInclusa(true).setAreScaunErgonomic(true).build();
		Rezervare rezervare4=new BuilderRezervareV2().setAreauturaInclusa(true).setAreMuzica(true).build();

		System.out.println(rezervare3);
		System.out.println(rezervare4);
	}

}
