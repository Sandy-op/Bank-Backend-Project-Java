package com.WorldBank;

public class Account {
    
    
    private final int accnum;
    private double accbal;
    private String custName;
    private boolean isActive;
    
    public Account(int accnum, double accbal, String custName, boolean isActive) {
	this.accnum = accnum;
	this.accbal = accbal;
	this.custName = custName;
	this.isActive = isActive;
    }

    public double getAccbal() {
        return accbal;
    }

    public void setAccbal(double accbal) {
        this.accbal = accbal;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getAccnum() {
        return accnum;
    }
    
    
    
}
