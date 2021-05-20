package ro.ase.CTS.ex6.Decorator;

public class EfectuarePlata implements IPlata{
	private int codPlata;
	private float sumaPlata;
	
	public EfectuarePlata(int codPlata, float sumaPlata) {
		super();
		this.codPlata = codPlata;
		this.sumaPlata = sumaPlata;
	}
	public int getCodPlata() {
		return codPlata;
	}
	public void setCodPlata(int codPlata) {
		this.codPlata = codPlata;
	}
	public float getSumaPlata() {
		return sumaPlata;
	}
	public void setSumaPlata(float sumaPlata) {
		this.sumaPlata = sumaPlata;
	}

	@Override
	public void descrierePlata() {
		System.out.println("EfectuarePlata [codPlata=" + codPlata + ", sumaPlata=" + sumaPlata + "]");
	}
	
	

}
