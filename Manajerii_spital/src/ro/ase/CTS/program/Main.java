package ro.ase.CTS.program;

import ro.ase.CTS.clase.AgentieInnerClass;
import ro.ase.CTS.clase.AgentieStaticBlock;
import ro.ase.CTS.clase.Dedicare;
import ro.ase.CTS.clase.ManagerSpital_Eager_Initialization;
import ro.ase.CTS.clase.Manager_Spital_Lazy;

public class Main {

	public static void main(String[] args) {
		
		ManagerSpital_Eager_Initialization manager1=ManagerSpital_Eager_Initialization.getInstance();
		ManagerSpital_Eager_Initialization manager2=ManagerSpital_Eager_Initialization.getInstance();

		
		System.out.println(manager1.toString());
		System.out.println(manager2.toString());


		Manager_Spital_Lazy managerLazy1=Manager_Spital_Lazy.getInstance("Ana", 33, 2);
		Manager_Spital_Lazy managerLazy2=Manager_Spital_Lazy.getInstance("Vlad", 93, 5555);
		
		//faptul ca eu setez varsta lui manager1 sau manager2, atunci oricum ambii vor avea aceeasi valoare
		
		managerLazy1.setVarsta(300);
		managerLazy1.setNume("Ionel");
		
		managerLazy2.setNume("Colentina");
		
		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
		
		
		Dedicare dedicare1=Dedicare.getInstantaDedicare("Florinela", 300, 300.2f);
		Dedicare dedicare2=Dedicare.getInstantaDedicare("Valentina", 330, 300.2f);
		
		System.out.println(dedicare1);
		System.out.println(dedicare2);
		
		//staticBlock
		AgentieStaticBlock agentieBlock=new AgentieStaticBlock();
		System.out.println(agentieBlock.toString());
		
		

	}

}
