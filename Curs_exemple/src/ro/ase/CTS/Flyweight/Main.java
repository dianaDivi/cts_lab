package ro.ase.CTS.Flyweight;

public class Main {

	public static void main(String[] args) {
		FabricaDePachete fabricaDePachete=new FabricaDePachete();
		
		Optionale optionale=new Optionale(false, 3);
		Optionale optionale2=new Optionale(true, 4);
		
		
		PachetTuristic pachetTuristic=(PachetTuristic) fabricaDePachete.getPachetTuristic(0);
		
		System.out.println(fabricaDePachete.getNumarPachete());
	
		

	}

}
