
public class Card implements ModPlata {

	@Override
	public void plateste(String nume, double sumaDePlatita) {
		System.out.println(nume+ " a platit Card: "+sumaDePlatita);
		
	}

}
