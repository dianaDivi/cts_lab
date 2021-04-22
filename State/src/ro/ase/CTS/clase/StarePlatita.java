package ro.ase.CTS.clase;

public class StarePlatita implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println(rezervare.getId()+" este in stare platita");
		rezervare.setStare(this);
		
	}


}
