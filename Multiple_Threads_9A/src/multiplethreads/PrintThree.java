package multiplethreads;

public class PrintThree implements Runnable{

	@Override
	public void run() {
		for(int i = 1;i<=15;i++) {
			if(i%2!=0 && i%3==0 && i%4!=0 && i%5!=0) {
				System.out.println(i+" is divisible by 3");
			}
		}
		// TODO Auto-generated method stub
		
	}

}
