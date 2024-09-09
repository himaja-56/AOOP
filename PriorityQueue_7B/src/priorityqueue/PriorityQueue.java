package priorityqueue;

import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueue<T> {
	private T[] heap;
	private int size;
	private Comparator<? super T> comparator;
	
	@SuppressWarnings("unchecked")
	public PriorityQueue(int capacity,Comparator<? super T> comparator) {
		this.heap = (T[]) new Object[capacity];
		this.size = 0;
		this.comparator = comparator;
	}
	
	public void insert(T element) {
		if(size == heap.length) {
			heap = Arrays.copyOf(heap, size*2);
		}
		heap[size] = element;
		siftUp(size);
		size++;
	}
	
	public T remove() {
		if(size == 0) {
			throw new RuntimeException("Priority queue is empty");
		}
		T result = heap[0];
		heap[0] = heap[--size];
		siftDown(0);
		return result;
	}
	
	public T peek() {
        if (size == 0) {
            throw new RuntimeException("Priority queue is empty");
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void siftUp(int index) {
        T element = heap[index];
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap[parentIndex];
            if (comparator.compare(element, parent) >= 0) {
                break;
            }
            heap[index] = parent;
            index = parentIndex;
        }
        heap[index] = element;
    }
    
    private void siftDown(int index) {
        T element = heap[index];
        int half = size / 2;
        while (index < half) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            int smallestChild = leftChild;
            if (rightChild < size && comparator.compare(heap[rightChild], heap[leftChild]) < 0) {
                smallestChild = rightChild;
            }
            if (comparator.compare(element, heap[smallestChild]) <= 0) {
                break;
            }
            heap[index] = heap[smallestChild];
            index = smallestChild;
        }
        heap[index] = element;
    }

}
