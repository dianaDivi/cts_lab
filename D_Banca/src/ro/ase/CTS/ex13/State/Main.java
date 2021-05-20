package ro.ase.CTS.ex13.State;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetragereDeLaBancomat bancomat=new RetragereDeLaBancomat(500);
		
		AreCard areCard=new AreCard();
		areCard.doAction(bancomat);
		
		arePinIntrodus arePinIntrodus=new arePinIntrodus();
		arePinIntrodus.doAction(bancomat);
		
		
		

	}

}
