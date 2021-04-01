package ro.ase.CTS.clase;

public class ManagerSpital_Eager_Initialization {
	private String nume;
	private int varsta;
	private int marca;
	
	//ne facem o instanta
	//daca avem si eager iniialization, aceasta instanta o si initializam
	private static ManagerSpital_Eager_Initialization manager=new ManagerSpital_Eager_Initialization("manager1", 2, 3);
	
	//functia este publica
	public static ManagerSpital_Eager_Initialization getInstance() {
		return manager;
	}
	
	//ca sa fie singleton constructorul apelat trebuie sa fie privat
	
	private ManagerSpital_Eager_Initialization(String nume, int varsta, int marca) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.marca = marca;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "ManagerSpital [nume=" + nume + ", varsta=" + varsta + ", marca=" + marca + "]";
	}
	
	
	
	

}
