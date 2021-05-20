package ro.ase.CTS.ex16.Chain_Z;

public abstract class Cont {
	private String detinator;
	private float sold;
	private Cont succesor;
		
	public Cont(String detinator, float sold) {
		super();
		this.detinator = detinator;
		this.sold = sold;
	}
	
	public String getDetinator() {
		return detinator;
	}

	public void setDetinator(String detinator) {
		this.detinator = detinator;
	}

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}

	public Cont getSuccesor() {
		return succesor;
	}

	public  void setSuccesor(Cont succesor) {
		this.succesor=succesor;
	}
	
	public abstract void realizarePlata(float sumaPrimita);
}
