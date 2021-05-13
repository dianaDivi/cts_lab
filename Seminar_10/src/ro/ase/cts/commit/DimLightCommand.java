package ro.ase.cts.commit;

public class DimLightCommand implements CommandInterface {
private LightBulb bulb;
	
	

	public DimLightCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}



	@Override
	public void execute() {
		bulb.dimLight();
	}
}
