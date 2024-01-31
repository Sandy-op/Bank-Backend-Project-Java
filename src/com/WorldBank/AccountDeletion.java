package com.WorldBank;

public class AccountDeletion {
    public void deleteAccount(Account account) {
	if(account.isActive()) {
	    account.setActive(false);
	    System.out.println("Account Inactivated...");
	}
    }
}