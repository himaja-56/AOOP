package messagingapplication;

public class Producer implements Runnable{
	private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
            try {
                buffer.produce("Message " + i);
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
		// TODO Auto-generated method stub
		
	}

}
