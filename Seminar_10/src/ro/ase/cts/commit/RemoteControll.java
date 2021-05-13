package ro.ase.cts.commit;

public class RemoteControll {
	CommandInterface lightOnCommand;
	CommandInterface lightOffCommand;
	CommandInterface dimLightCommand;
	CommandInterface increaseLight;
	public RemoteControll(CommandInterface lightOnCommand, CommandInterface lightOffCommand,
			CommandInterface dimLightCommand, CommandInterface increaseLight) {
		super();
		this.lightOnCommand = lightOnCommand;
		this.lightOffCommand = lightOffCommand;
		this.dimLightCommand = dimLightCommand;
		this.increaseLight = increaseLight;
	}

	public void pressLightOn() {
		lightOnCommand.execute();
	}
	
	public void pressLightOff() {
		lightOffCommand.execute();
	}
	public void pessDimButton() {
		dimLightCommand.execute();
	}
	
	public void IncreaseLightCommand() {
		increaseLight.execute();
	}
}
