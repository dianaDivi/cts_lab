package ro.ase.CTS.clase;

public class AgentieStaticBlock {

	private String numeAgentie;
	private float capital;
	private int numarAngajati;
	
	private static AgentieStaticBlock instanta;
	
	static {
		try {
			instanta=new AgentieStaticBlock();
		}catch (Exception e) {
			System.out.println("Agentia nu poate fi creata");
		}
	}
	
	public AgentieStaticBlock() {
		this.numeAgentie = "Andria";
		this.capital = 33;
		this.numarAngajati = 2;
	}
	public void setNumeAgentie(String numeAgentie) {
		this.numeAgentie = numeAgentie;
	}
	public void setCapital(float capital) {
		this.capital = capital;
	}
	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}
	
	@Override
	public String toString() {
		return "AgentieStaticBlock [numeAgentie=" + numeAgentie + ", capital=" + capital + ", numarAngajati="
				+ numarAngajati + "]";
	}

	
}
