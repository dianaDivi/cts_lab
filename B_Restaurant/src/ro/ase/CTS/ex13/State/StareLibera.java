package ro.ase.CTS.ex13.State;

public class StareLibera implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		if(!(masa.getStare() instanceof StareLibera)) {
			System.out.println("Masa "+masa.getNrMasa()+" a fost eliberata");
			masa.setStare(this);
		}else {
			System.out.println("Masa este deja libera");
		}
	}

}
