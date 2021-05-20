package ro.ase.CTS.ex13.State;

public class StareInternat implements Stare  {

	@Override
	public void stabilireStarePacient(Pacient pacient) {
		if(pacient.getStare() instanceof StareExternat) {
			System.out.println("Internare pacient: "+pacient.getNumePacient());
			pacient.setStare(this);
		}else {
			System.out.println("Pacientul este deja internat");
		}
	}
	

}
