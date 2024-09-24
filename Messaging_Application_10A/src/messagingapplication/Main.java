package messagingapplication;

public class Main {

	public static void main(String[] args) {
		SharedBuffer buffer = new SharedBuffer(10);

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
		// TODO Auto-generated method stub

	}

}
