package seminar12;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount extends Account{
	protected ArrayList<NotificationInterface> observers;
	protected double balance;
	protected String iban;
	
	public BankAccount() {
		this.observers = new ArrayList<NotificationInterface>();
		this.balance = 0;
		this.iban = "";
	}
	
	public BankAccount(double balance, String iban) {
		this.observers = new ArrayList<NotificationInterface>();
		this.balance = balance;
		this.iban = iban;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addObserver(NotificationInterface observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(NotificationInterface observer) {
		this.observers.remove(observer);
	}
}



