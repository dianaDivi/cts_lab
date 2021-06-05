package ro.ase.cts.commit;

public class IncreaseLightIntentityCommand  implements CommandInterface{
private LightBulb bulb;
	
	

	public IncreaseLightIntentityCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}



	@Override
	public void execute() {
		bulb.increaseLightIntensity();
	}
}
