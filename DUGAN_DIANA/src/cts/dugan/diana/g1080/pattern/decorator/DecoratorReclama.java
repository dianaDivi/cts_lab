package cts.dugan.diana.g1080.pattern.decorator;

public class DecoratorReclama extends DecoratorAbstract {

	public DecoratorReclama(Modificabil clipAbstract) {
		super(clipAbstract);
		
	}
	
	@Override
	public void modificaReclama(int durata, int moment) {
		System.out.println("Reclama modificata");
		super.modificaReclama(durata, moment);
		
	}

	
}
