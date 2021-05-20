package ro.ase.CTS.ex1.SympleFactory;

public class FactoryCredit {
	public ICredit creareCredit(EnumCredite enumCredite) {
		switch (enumCredite) {
		case NefoiPersonale:
			return new NevoiPersoanle();
		case CreditIpotecar:
			return new CreditIpotecar();
		default:
			throw new IllegalArgumentException("Creditul nu se poate gasi");
		}
	}

}
