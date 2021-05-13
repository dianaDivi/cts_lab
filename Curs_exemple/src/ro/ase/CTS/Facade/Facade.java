package ro.ase.CTS.Facade;

public class Facade {
	public void rezervaCazareTransport(String OrasPlecare, String OrasDestinatie) {
		CompanieAeriana companieAeriana=new CompanieAeriana("BBC");
		Zbor zbor=new Zbor(companieAeriana, OrasPlecare, OrasDestinatie);
		
		Hotel hotel=new Hotel("Malibu");
		System.out.println(zbor.toString());
		hotel.rezervaCamera("Columbia");
	}

}
