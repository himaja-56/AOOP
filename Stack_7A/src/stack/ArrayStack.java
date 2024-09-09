package stack;

public class ArrayStack<T> implements Stack<T> {
	private T[] array;
	private int top;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		array=(T[]) new Object[capacity];
		top=-1;
	}
	
	@Override
	public void push(T element) {
		if(top==capacity-1) {
			throw new StackOverflowError("Stack is full");
		}
		array[++top] = element;
		// TODO Auto-generated method stub
		
	}
	@Override
	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		// TODO Auto-generated method stub
		return array[top--];
	}
	@Override
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		// TODO Auto-generated method stub
		return array[top];
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	
	

}
