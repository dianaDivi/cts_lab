package ro.ase.CTS.clase;

public class Manager_Spital_Lazy {
	private String nume;
	private int varsta;
	private int marca;
	
	//lazyInitialization este folosita cel mai mult
	//Clasa sa contina initialele, singleton treade_save si cu atribute diferite
	
	
	private static Manager_Spital_Lazy instanta=null;
	
	public static synchronized Manager_Spital_Lazy getInstance(String nume, int varsta, int marca) {
		if(instanta==null) {
			instanta=new Manager_Spital_Lazy(nume, varsta, marca);
		}
		return instanta;
	}
	
	public Manager_Spital_Lazy(String nume, int varsta, int marca) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.marca = marca;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Manager_Spital_Lazy [nume=" + nume + ", varsta=" + varsta + ", marca=" + marca + "]";
	}
	
	
}
