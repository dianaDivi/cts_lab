package cts.dugan.diana.g1080.pattern.decorator;

public abstract class DecoratorAbstract implements Modificabil{
	private Modificabil clipAbstract;

	public DecoratorAbstract(Modificabil clipAbstract) {
		super();
		this.clipAbstract = clipAbstract;
	}

	public Modificabil getClipAbstract() {
		return clipAbstract;
	}

	@Override
	public void modificaReclama(int durata, int moment) {
		clipAbstract.modificaReclama(durata, moment);
		
	}
	
	
	
}
