package ro.ase.CTS.Command;

public class PachetTransport implements PachetTuristic {
	private int cod;
	
	public PachetTransport(int cod) {
		super();
		this.cod = cod;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public void vanzare() {
		System.out.println("vanzare pachet de transport");
		
	}

	@Override
	public void rezervare() {
		System.out.println("Rezervare pachet transport");
		
	}

}	
