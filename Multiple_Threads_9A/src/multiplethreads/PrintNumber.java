package multiplethreads;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new PrintTwo());
		Thread t2 = new Thread(new PrintThree());
		Thread t3 = new Thread(new PrintFour());
		Thread t4 = new Thread(new PrintFive());
		Thread t5 = new Thread(new PrintNum());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
