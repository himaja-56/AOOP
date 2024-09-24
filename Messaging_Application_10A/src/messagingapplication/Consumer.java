package messagingapplication;

public class Consumer implements Runnable {
	private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
            try {
                buffer.consume();
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
		// TODO Auto-generated method stub
		
	}

}
