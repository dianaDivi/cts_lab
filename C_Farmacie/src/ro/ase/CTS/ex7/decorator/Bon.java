package ro.ase.CTS.ex7.decorator;

public class Bon implements IBon{ 
	private int idCod;
	private int nrProduse;
	private float pret;
	
	public Bon(int idCod, int nrProduse, float pret) {
		super();
		this.idCod = idCod;
		this.nrProduse = nrProduse;
		this.pret = pret;
	}

	public int getIdCod() {
		return idCod;
	}

	public void setIdCod(int idCod) {
		this.idCod = idCod;
	}

	public int getNrProduse() {
		return nrProduse;
	}

	public void setNrProduse(int nrProduse) {
		this.nrProduse = nrProduse;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	

	@Override
	public String toString() {
		return "Bon [idCod=" + idCod + ", nrProduse=" + nrProduse + ", pret=" + pret + "]";
	}

	@Override
	public void afisareBon() {
		System.out.println("Bon [idCod=" + idCod + ", nrProduse=" + nrProduse + ", pret=" + pret + "]"); 
	}
	
	

}
