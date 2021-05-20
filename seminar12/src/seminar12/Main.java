package seminar12;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		CreditAccount account = new CreditAccount(1000, "IBAN00000");
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double amount) {
				System.out.println("[Inline example]: "+ amount + " extracted.");
			}
		});
		NotificationInterface smsNotificationService = new SmsNotification();
		account.addObserver(smsNotificationService);
		try {
			account.withdraw(100);
			account.removeObserver(smsNotificationService);
			account.withdraw(100);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------------");
		ArrayList<CharacterMemento> saveList = new ArrayList<CharacterMemento>();
		GameCharacter myCharacter = new GameCharacter("Alex", 100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("Character hitpoints: " + myCharacter.getHitpoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println("Character hitpoints: " + myCharacter.getHitpoints());

	

	}

}
