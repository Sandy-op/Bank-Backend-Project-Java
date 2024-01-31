package com.WorldBank;

public class AccountCreation {
    private int randnum = 1000001;
    
    Account createAccount(String custName,double accbal) {
	System.out.println("Creating an Account...");
	Account acc = new Account(randnum++, accbal, custName, true);
	
	return acc;
    }
}
