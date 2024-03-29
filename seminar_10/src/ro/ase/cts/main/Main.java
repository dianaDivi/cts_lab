package ro.ase.cts.main;

import ro.ase.cts.chain.AbstractLogger;
import ro.ase.cts.chain.LoggerChainFactory;
import ro.ase.cts.chain.Verbosity;
import ro.ase.cts.commit.CommandInterface;
import ro.ase.cts.commit.DimLightCommand;
import ro.ase.cts.commit.IncreaseLightIntentityCommand;
import ro.ase.cts.commit.LightBulb;
import ro.ase.cts.commit.RemoteControll;
import ro.ase.cts.commit.TurnLightOnCommand;
import ro.ase.cts.commit.TurnOffLightCommand;
import ro.ase.cts.strategy.MarketingStrategyInterface;
import ro.ase.cts.strategy.ModulMarketing;
import ro.ase.cts.strategy.RandomMarketingStrategy;

public class Main {

	public static void main(String[] args) {
//		ModulMarketing modulMarketing = new ModulMarketing();
//		modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
//		double puncteBonus = modulMarketing.getBonus(100);
//		System.out.println("Numar puncte bonus: " + puncteBonus);
//		
//		modulMarketing.setCurrentStrategy(new MarketingStrategyInterface() {
//			
//			@Override
//			public double calculateBonus(double base) {
//				return 30 * base;
//			}
//		});
//		
//		puncteBonus = modulMarketing.getBonus(100);
//		System.out.println("Numar puncte bonus: " + puncteBonus);
//		
//		modulMarketing.setCurrentStrategy((base) -> {return 20 * base;});
//		
//		puncteBonus = modulMarketing.getBonus(100);
//		System.out.println("Numar puncte bonus: " + puncteBonus);
//		
//		System.out.println("-----------------------------------------------------");
//		AbstractLogger loggerChain = LoggerChainFactory.getChainOfLoggers();
//		loggerChain.logMessage(Verbosity.INFO, "This log is FYI");
//		loggerChain.logMessage(Verbosity.ERROR, "Something went wrong");
//		loggerChain.logMessage(Verbosity.DEBUG, "This is a debug message");
		
		System.out.println("-----------------------------------------------------");
		LightBulb buld=new LightBulb();
		CommandInterface lightOnCommand=new TurnLightOnCommand(buld);
		CommandInterface turnOffLightCommand=new TurnOffLightCommand(buld);
		CommandInterface dimLightCommand=new DimLightCommand(buld);
		CommandInterface increaseLightIntentityCommand=new IncreaseLightIntentityCommand(buld);


		RemoteControll remote=new RemoteControll(lightOnCommand, turnOffLightCommand, dimLightCommand, increaseLightIntentityCommand);
		
		remote.pressLightOn();
		remote.IncreaseLightCommand();
		remote.pessDimButton();
		remote.pessDimButton();
		
	}

	

}
