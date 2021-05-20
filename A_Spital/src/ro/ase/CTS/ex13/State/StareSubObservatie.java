package ro.ase.CTS.ex13.State;

public class StareSubObservatie implements Stare{

	@Override
	public void stabilireStarePacient(Pacient pacient) {
		if(!(pacient.getStare() instanceof StareSubObservatie)) {
			System.out.println("Clientul "+pacient.getNumePacient()+" s-a stabilit sa fie sub observare ");
			pacient.setStare(this);
		}else {
			System.out.println("Pacientul deja se afla sub oservare");
		}
	}
	

}
