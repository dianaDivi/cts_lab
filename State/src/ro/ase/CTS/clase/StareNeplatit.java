package ro.ase.CTS.clase;

public class StareNeplatit implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println( rezervare.getId() +  "este neplatita");
		rezervare.setStare(this);
	}

}
