package ro.ase.CTS.ex13.Command;

abstract class Command {
	private ContBancar contBancar;
	private float suma;
	
	public Command(ContBancar contBancar, float suma) {
		super();
		this.contBancar = contBancar;
		this.suma = suma;
	}
	
	public abstract void executa();

	public ContBancar getContBancar() {
		return contBancar;
	}

	public void setContBancar(ContBancar contBancar) {
		this.contBancar = contBancar;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}
	
	

}
