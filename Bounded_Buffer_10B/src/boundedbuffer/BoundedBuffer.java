package boundedbuffer;

import java.util.LinkedList;
import java.util.Queue;


public class BoundedBuffer {
	
	private final int capacity;
	private final Queue<Integer> buffer;
	private final Object lock = new Object();
	
	public BoundedBuffer(int capacity) {
		this.capacity = capacity;
		this.buffer = new LinkedList<>();
	}
	
	public void produce(int item) throws InterruptedException{
		synchronized(lock) {
			while(buffer.size()==capacity) {
				lock.wait();
			}
			buffer.add(item);
			System.out.println("Produced: "+item);
			lock.notifyAll();
		}
	}
	
	public int consume() throws InterruptedException{
		synchronized(lock) {
			while(buffer.isEmpty()) {
				lock.wait();
			}
			int item=buffer.poll();
			System.out.println("Consumed: "+ item);
			lock.notifyAll();
			return item;
		}
	}
}
