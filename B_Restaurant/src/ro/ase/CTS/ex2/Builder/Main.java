package ro.ase.CTS.ex2.Builder;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare=new AbstractRezervareBuilder().builder();
		System.out.println( rezervare.toString());
		
		Rezervare rezervare1=new AbstractRezervareBuilder().setNrRezervare(1).setAsezareLaGeam(true).builder();
		System.out.println( rezervare1.toString());
		
		Rezervare rezervare2=new AbstractRezervareBuilder().setNrRezervare(2).setAsezareLaGeam(true).setDecorareMasa(true).setGenMuzica(true).builder();
		System.out.println( rezervare2.toString());
		
		Rezervare rezervare3=new AbstractRezervareBuilder().setNrRezervare(3).setAsezareLaGeam(true).setScauneErgonomice(true).setMuzicaAmbientalaPersonalizata(true).setDecorareMasa(true).setGenMuzica(true).builder();
		System.out.println( rezervare3.toString());
		
	}

}
