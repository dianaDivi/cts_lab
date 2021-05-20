package ro.ase.CTS.ex9.Composite;

public class Main {

	public static void main(String[] args) {
		Agentie map=new Agentie("Map");
		
		Agentie a=new Agentie("A");
		Agentie b=new Agentie("B");
		Agentie c=new Agentie("C");
		
		map.adaugaNod(c);
		map.adaugaNod(b);
		map.adaugaNod(a);
		
		Filiala f1=new Filiala("F1");
		Filiala f2=new Filiala("F2");
		
		a.adaugaNod(f1);
		b.adaugaNod(f2);
		c.adaugaNod(b);
		
		map.afiseazaInformatii();
	}

}
