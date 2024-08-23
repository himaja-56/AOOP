package com.Banking;

public class LoginSystem {
	
    private static LoginSystem singleInstance = null;
    private boolean isLoggedIn = false;
    private LoginSystem() {}

    public static LoginSystem getInstance() {
        if (singleInstance == null) {
            singleInstance = new LoginSystem();
        }
        return singleInstance;
    }

    public void login(String username, String password) {

        if (authenticate(username, password)) {
            isLoggedIn = true;
            System.out.println("User " + username + " logged in successfully.");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
    }

    public void logout() {
        isLoggedIn = false;
        System.out.println("User logged out successfully.");
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    private boolean authenticate(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }
}
