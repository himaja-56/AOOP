package stack;

public class LinkedListStack<T> implements Stack<T> {
	private Node<T> top;
	public static class Node<T>{
		T data;
		Node<T> next;
		
		Node(T data){
			this.data = data;
		}
	}
	@Override
	public void push(T element) {
		Node<T> newNode = new Node<>(element);
		newNode.next = top;
		top = newNode;
		// TODO Auto-generated method stub
		
	}
	@Override
	public T pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		// TODO Auto-generated method stub
		T data = top.data;
		top = top.next;
		return data;
	}
	@Override
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		// TODO Auto-generated method stub
		return top.data;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==null;
	}

}
