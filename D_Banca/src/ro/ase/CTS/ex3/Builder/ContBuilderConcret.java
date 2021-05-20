package ro.ase.CTS.ex3.Builder;

public class ContBuilderConcret implements IBuilderAstract {
	private Cont cont;

	public ContBuilderConcret() {
		cont=new Cont(false, false);
	}
	

	public ContBuilderConcret setCard(boolean card) {
		cont.setCard(card);
		return this;
	}

	

	public ContBuilderConcret setInternetBanking(boolean internetBanking) {
		cont.setInternetBanking(internetBanking);
		return this;
	}


	@Override
	public Cont build() {
		return cont;
	}


}
