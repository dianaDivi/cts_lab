package ro.ase.cts.main;

import ro.ase.cts.Strategy.MarketingStrategyInterface;
import ro.ase.cts.Strategy.ModulMarketing;
import ro.ase.cts.Strategy.RandomMarketingStrategy;

public class Main {

	public static void main(String[] args) {
		ModulMarketing modulMarketing = new ModulMarketing();
		modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
		double puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);
		
		modulMarketing.setCurrentStrategy(new MarketingStrategyInterface() {
			
			@Override
			public double calculateBonus(double base) {
				return 30 * base;
			}
		});
		
		puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);
		
		modulMarketing.setCurrentStrategy((base) -> {return 20 * base;});
		
		puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);
	}

	

}
