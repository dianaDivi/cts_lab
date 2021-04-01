package ro.ase.CTS.clase;

public class AgentieInnerClass {

	private String numeAgentie;
	private float capital;
	private int numarAngajati;
	
	private static class AgentieHelper{
		private static final AgentieInnerClass  instanta=new AgentieInnerClass();
	}
	
	
	public static AgentieInnerClass getInstanta(String nume, float capital, int numarAngajati) {
		return AgentieHelper.instanta;
	}

	public AgentieInnerClass() {
		this.numeAgentie = "numeAgentie";
		this.capital = 444;
		this.numarAngajati = 2;
	}

	public String getNumeAgentie() {
		return numeAgentie;
	}

	public void setNumeAgentie(String numeAgentie) {
		this.numeAgentie = numeAgentie;
	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public int getNumarAngajati() {
		return numarAngajati;
	}

	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}
}
