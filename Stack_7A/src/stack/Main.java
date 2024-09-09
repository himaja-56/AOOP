package stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println("Array Stack: ");
        System.out.println("Peek: " + arrayStack.peek()); 
        System.out.println("Pop: " + arrayStack.pop());  
        System.out.println("isEmpty: " + arrayStack.isEmpty()); 

        Stack<String> linkedListStack = new LinkedListStack<>();
        linkedListStack.push("A");
        linkedListStack.push("B");
        linkedListStack.push("C");
        System.out.println("LinkedListStack: ");
        System.out.println("Peek: " + linkedListStack.peek()); 
        System.out.println("Pop: " + linkedListStack.pop());   
        System.out.println("isEmpty: " + linkedListStack.isEmpty()); 
		// TODO Auto-generated method stub

	}

}
