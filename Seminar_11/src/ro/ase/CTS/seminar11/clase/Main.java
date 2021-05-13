package ro.ase.CTS.seminar11.clase;

import ro.ase.CTS.seminar11.state.Gate;

public class Main {

	public static void main(String[] args) {
		
		Gate secureGate=new Gate();
		secureGate.authorize();
		secureGate.enter();
		secureGate.enter();
	}

}
