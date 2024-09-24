package bankaccountmanagementsystem;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0);
		Thread t1 = new Thread(()->{
			account.deposit(1000);
			account.withdraw(200);
		});
		
		Thread t2 = new Thread(()->{
			account.deposit(1500);
			account.withdraw(350);
		});
		
		Thread t3 = new Thread(()->{
			account.deposit(300);
			account.withdraw(150);
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance: "+account.getBalance());
		// TODO Auto-generated method stub

	}

}
