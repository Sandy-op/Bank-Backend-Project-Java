package com.WorldBank;

public class WithdrawTransaction {
    public void withdraw(Account account, double amount) {
	if(account.isActive()) {
	    if(account.getAccbal() > amount) {
	       account.setAccbal(account.getAccbal() - amount);
	       System.out.println("Withdraw Rs "+amount+" success");
	}else{
	    System.out.println("Withdraw Failed: Due to insufficent balance..");
	    }
	}else {
		System.out.println("Account is inactive, cannot do Withdraw");
    	}
    }
}