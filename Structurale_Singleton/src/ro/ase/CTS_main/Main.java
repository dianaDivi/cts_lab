package ro.ase.CTS_main;

import ro.ase.CTS_clase.AgentieEager;
import ro.ase.CTS_clase.AgentieLazyInitialization;
import ro.ase.CTS_clase.AgentieSaticBlock;
import ro.ase.CTS_clase.AgentieThreadSave;

public class Main {

	public static void main(String[] args) {
		System.out.println("Singleton Eager");
		AgentieEager instanta=AgentieEager.getInstanta();
		
		System.out.println(instanta.toString());
		System.out.println("\n");
		
		System.out.println("Singleton Static");
		AgentieSaticBlock instantaStatic=AgentieSaticBlock.getInstanta();
		System.out.println(instantaStatic.toString());
		
		System.out.println("Singleton Lazy Initialization");
		AgentieLazyInitialization instantaLazy=AgentieLazyInitialization.getAgentie("Agentie Lazy", 0, 0);
		AgentieLazyInitialization instantaLazy2=AgentieLazyInitialization.getAgentie("Agentie Lazy 2", 3.2f, 0);

		System.out.println(instantaLazy.toString());
		System.out.println(instantaLazy2.toString());
		
		System.out.println("Singleton ThreadSave");
		
		AgentieThreadSave agentie=AgentieThreadSave.getInstanta("ana", 4, 4);
		AgentieThreadSave agentie2=AgentieThreadSave.getInstanta("Al0", 3, 2);
		
		System.out.println(agentie.toString());
		System.out.println(agentie2.toString());
		
	}

}
