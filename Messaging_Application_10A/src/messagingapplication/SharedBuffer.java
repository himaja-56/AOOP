package messagingapplication;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
	private final int capacity;
	private final Queue<String> buffer;
	private final Object lock = new Object();
	
	public SharedBuffer(int capacity) {
		this.capacity = capacity;
		this.buffer = new LinkedList<>();
	}
	
	public void produce(String message) throws InterruptedException {
        synchronized (lock) {
            while (buffer.size() == capacity) {
                lock.wait();
            }
            buffer.add(message);
            System.out.println("Produced: " + message);
            lock.notifyAll();
        }
    }

    public String consume() throws InterruptedException {
        synchronized (lock) {
            while (buffer.isEmpty()) {
                lock.wait();
            }
            String message = buffer.poll();
            System.out.println("Consumed: " + message);
            lock.notifyAll();
            return message;
        }
    }

}
