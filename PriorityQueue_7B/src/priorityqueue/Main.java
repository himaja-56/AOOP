package priorityqueue;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<Integer> intQueue = new PriorityQueue<>(10, Comparator.naturalOrder());
        intQueue.insert(1);
        intQueue.insert(2);
        intQueue.insert(3);
        System.out.println("Integer PriorityQueue: ");
        System.out.println("Peek: " + intQueue.peek()); 
        System.out.println("Remove: " + intQueue.remove());
        System.out.println("isEmpty: " + intQueue.isEmpty()); 

        // Test with Doubles
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(10, Comparator.naturalOrder());
        doubleQueue.insert(1.1);
        doubleQueue.insert(2.2);
        doubleQueue.insert(3.3);
        System.out.println("Double PriorityQueue: ");
        System.out.println("Peek: " + doubleQueue.peek()); 
        System.out.println("Remove: " + doubleQueue.remove()); 
        System.out.println("isEmpty: " + doubleQueue.isEmpty()); 

        // Test with Strings
        PriorityQueue<String> stringQueue = new PriorityQueue<>(10, Comparator.naturalOrder());
        stringQueue.insert("apple");
        stringQueue.insert("banana");
        stringQueue.insert("mago");
        System.out.println("String PriorityQueue: ");
        System.out.println("Peek: " + stringQueue.peek()); 
        System.out.println("Remove: " + stringQueue.remove()); 
        System.out.println("isEmpty: " + stringQueue.isEmpty());
		// TODO Auto-generated method stub

	}

}
