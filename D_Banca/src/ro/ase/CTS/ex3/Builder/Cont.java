package ro.ase.CTS.ex3.Builder;

public class Cont {
	private boolean card;
	private boolean internetBanking;
	
	public Cont(boolean card, boolean internetBanking) {
		super();
		this.card = card;
		this.internetBanking = internetBanking;
	}

	public boolean isCard() {
		return card;
	}

	public void setCard(boolean card) {
		this.card = card;
	}

	public boolean isInternetBanking() {
		return internetBanking;
	}

	public void setInternetBanking(boolean internetBanking) {
		this.internetBanking = internetBanking;
	}

	@Override
	public String toString() {
		return "Cont [card=" + card + ", internetBanking=" + internetBanking + "]";
	}
	
	

}
