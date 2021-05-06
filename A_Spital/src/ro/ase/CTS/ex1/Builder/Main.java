package ro.ase.CTS.ex1.Builder;

public class Main { 

	public static void main(String[] args) {
		Facilitati facilitati=new ConcretBuilder().setNumePacient("Vecinul").setHalatPtInterior(true).build();
		System.out.println(facilitati);

	}

}
