package boundedbuffer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BoundedBuffer buffer = new BoundedBuffer(10);

	        Thread producerThread = new Thread(new Producer(buffer));
	        Thread consumerThread = new Thread(new Consumer(buffer));

	        producerThread.start();
	        consumerThread.start();

	        try {
	            producerThread.join();
	            consumerThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	}

}
