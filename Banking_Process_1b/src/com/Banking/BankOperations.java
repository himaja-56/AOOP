package com.Banking;

public class BankOperations {
    private LoginSystem loginState;
    private double amounti=1000;
    public double getAmount() {
		return amounti;
	}

	public void setAmount(double amounti) {
		this.amounti = 1000;
	}

    public BankOperations() {
        loginState = LoginSystem.getInstance();
    }

    public void deposit(double amount) {
    	amounti = amounti+amount;
        if (loginState.isLoggedIn()) {
            System.out.println("$" + amounti + " has been deposited into your account.");
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
    	amounti = amounti-amount;
        if (loginState.isLoggedIn()) {
            System.out.println("$" + amounti + " has been withdrawn from your account.");
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }

	public void viewBalance() {
		if (loginState.isLoggedIn()) {
            System.out.println("Your balance is "+amounti);
        } else {
            System.out.println("Please log in to view your balance.");
        }
		
	}

	
}
