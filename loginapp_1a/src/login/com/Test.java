package login.com;

public class Test {

	public static void main(String[] args) {
		LoginSystem login_user1 = LoginSystem.getUser();
		LoginSystem login_user2 = LoginSystem.getUser();
		login_user1.login("Madhav");
		login_user2.login("Krishna");
		login_user1.logout();
		login_user2.logout();
		// TODO Auto-generated method stub

	}

}
	