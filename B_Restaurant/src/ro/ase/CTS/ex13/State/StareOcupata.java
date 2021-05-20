package ro.ase.CTS.ex13.State;

public class StareOcupata implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		if(!(masa.getStare() instanceof StareOcupata)) {
			System.out.println("Ati ocupat masa "+masa.getNrMasa());
			masa.setStare(this);
		}else {
			System.out.println("Masa este deja ocupata");
		}
		
	}

}
