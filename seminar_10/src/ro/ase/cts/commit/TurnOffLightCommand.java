package ro.ase.cts.commit;

public class TurnOffLightCommand implements CommandInterface{
	private LightBulb bulb;
	
	

	public TurnOffLightCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}



	@Override
	public void execute() {
		bulb.turnOffLight();
	}

}
