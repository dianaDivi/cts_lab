package ro.ase.CTS.Adapter;

public class AdaptorLeassing extends OferiteCredit implements ICredit {

	public AdaptorLeassing(float suma) {
		super(suma);
	}

	@Override
	public void adaptareCreditLeassing() {
		super.adaptareCredit();
	}
	 
}
