package ride;

public class UserAuthentication {
	private static UserAuthentication instance;
	private boolean isAuthenticated;
	
	private UserAuthentication() {
		
	}
	
	public static UserAuthentication getInstance() {
		if(instance == null) {
			instance = new UserAuthentication();
		}
		return instance;
	}
	
	public void login(String username,String password) {
		System.out.println("User "+username +" is authenticated.");
		isAuthenticated = true;
	}
	
	public boolean isAuthenticated() {
		return isAuthenticated;
	}
	
	public void logout() {
		isAuthenticated = false;
		System.out.println("User logged out");
	}

}
