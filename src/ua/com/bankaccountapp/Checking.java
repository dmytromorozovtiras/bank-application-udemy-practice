package ua.com.bankaccountapp;

public class Checking extends Account {
	// List properties specific to a Checking account
	int debitCardNumber;
	int debitCardPIN;
	// Constructor to initialize checking account properties
	public Checking (String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		System.out.println("NEW CHECKING ACCOUNT");
	}
	
	// List any methods specific to the checking account
	
}
