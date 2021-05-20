package ro.ase.CTS.ex13.State;

public class StareExternat implements Stare{

	@Override
	public void stabilireStarePacient(Pacient pacient) {
		if(!(pacient.getStare() instanceof StareExternat)) {
			System.out.println("Externeaza Pacientul "+ pacient.getNumePacient());
			pacient.setStare(this);
		}else {
			System.out.println("Pacientul este deja externat");
		}
		
	}

}
