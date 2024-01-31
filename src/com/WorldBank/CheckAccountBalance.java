package com.WorldBank;

public class CheckAccountBalance {
    public void viewBalance(Account account) {
	if(account.isActive()) {
	    System.out.println("Account Balance: "+account.getAccbal());
	}else {
	    System.out.println("Account is not Active");
	}
    }
}
