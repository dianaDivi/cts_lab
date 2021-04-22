package ro.ase.CTS_main;

import ro.ase.CTS_factory.clase.AgentieFactory;
import ro.ase.CTS_factory.clase.AgentieSingletonFcatory;
import ro.ase.CTS_factory.clase.PachetTuristic;
import ro.ase.CTS_factory.clase.TipPachet;

public class Main {

	public static void main(String[] args) {
		AgentieFactory agentieFactory=new AgentieFactory();
		PachetTuristic pachetTuristic=null;
		
		try {
			pachetTuristic=agentieFactory.createPachet(TipPachet.pachetCazare);
		}catch(Exception e){
			
		}

		pachetTuristic.descriere();
		
		
		AgentieSingletonFcatory agentieSingletonFcatory=AgentieSingletonFcatory.getInstanta();
		
		
		try {

			pachetTuristic=agentieFactory.createPachet(TipPachet.pachetCazareTransport);
		}catch (Exception e) {
			System.out.println("Pachetul nu exista");
		}
		
		pachetTuristic.descriere();
	}

}
