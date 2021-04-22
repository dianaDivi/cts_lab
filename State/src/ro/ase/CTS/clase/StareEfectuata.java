package ro.ase.CTS.clase;

public class StareEfectuata implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println(rezervare.getId()+" a fost efectuata ");
		rezervare.setStare(this);
		
	}

}
