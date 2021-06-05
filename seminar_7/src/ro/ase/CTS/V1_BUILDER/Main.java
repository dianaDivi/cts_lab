package ro.ase.CTS.V1_BUILDER;

public class Main {

	public static void main(String[] args) {
		PachetTransport pachetTransport=new PachetTransportBuilder().setHasAC(true).setHasTV(true).build();
		
		System.out.println(pachetTransport.toString());
		
		

	}

}
