package ro.ase.CTS.ex13.State;

public class StareRezervare implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Ati rezervat masa cu codul: "+ masa.getNrMasa());
			masa.setStare(this);
		}else {
			System.out.println("Masa nu poate fi rezervata");
		}
	}

}
