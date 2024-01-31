package com.WorldBank;

public class RunBankApp {

    public static void main(String[] args) {
	AccountCreation ac = new AccountCreation();
	AccountDeletion ad = new AccountDeletion();
	WithdrawTransaction wt = new WithdrawTransaction();
	CheckAccountBalance cb = new CheckAccountBalance();
	
	
	//creating account
	Account a1 = ac.createAccount("Sandy", 10000.00);
	
	cb.viewBalance(a1);
	wt.withdraw(a1, 5000);
	cb.viewBalance(a1);
	
	
	//deleting account
	ad.deleteAccount(a1);
	cb.viewBalance(a1);
	wt.withdraw(a1, 1500.00);
    }

}
