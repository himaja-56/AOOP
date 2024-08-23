package login.com;

public class LoginSystem {
	private static LoginSystem instance;
	private String loggedInuser;
	private LoginSystem() {
		loggedInuser = null; 
	}
	public static LoginSystem getUser() {
		if(instance == null) {
			instance = new LoginSystem();
		}
		return instance;
	}
	public void login(String Username) {
		if(loggedInuser == null) {
			loggedInuser = Username;
			System.out.println("User logged in successfully : "+Username);
		}
		else {
			System.out.println("Another user is already logged in..\nLogin Failed : "+ Username);
		}
	}
	public void logout() {
		if(loggedInuser != null) {
			System.out.println("User " + loggedInuser + " logged out Successfully");
			loggedInuser = null;
		}
		else {
			System.out.println("No one is logged in");	
		}
	}
}
