package boundedbuffer;

public class Producer implements Runnable{
	private final BoundedBuffer buffer;
	
	public Producer(BoundedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			try {
				buffer.produce(i);
				Thread.sleep(100);
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		// TODO Auto-generated method stub
		
	}

}
