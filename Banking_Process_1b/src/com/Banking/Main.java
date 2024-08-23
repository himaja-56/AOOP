package com.Banking;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginState = LoginSystem.getInstance();

        loginState.login("user", "password");

        BankOperations bankOperations = new BankOperations();
        bankOperations.viewBalance();
        bankOperations.deposit(500);
        bankOperations.withdraw(200);
        bankOperations.viewBalance();

        loginState.logout();

        bankOperations.viewBalance(); 
    }
}
