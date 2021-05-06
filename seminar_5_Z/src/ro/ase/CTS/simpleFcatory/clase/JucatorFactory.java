package ro.ase.CTS.simpleFcatory.clase;

public class JucatorFactory {
	
	
	private static JucatorFactory instanta=null;
	public static synchronized JucatorFactory getInstanta() {
		if(instanta==null) {
			instanta=new JucatorFactory();
		}
		
		return instanta;
	}
	
	public static Jucator creareJucator(TipJucator tipJucator, String numeJucator) throws Exception {
		
		switch (tipJucator) {
		case Portar:
			return new Portar(numeJucator);
		case Fundas:
			return new Fundas(numeJucator);
		case Atacant:
			return new Atacant(numeJucator);
		default:
			throw new Exception("Nu exista jucator");
		}
	}
}
