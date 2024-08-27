package browsinghistory;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
	private Deque<String> backStack;
	private Deque<String> forwardStack;
	private String currentPage;
	
	public BrowserHistory() {
		backStack = new ArrayDeque<>();
		forwardStack = new ArrayDeque<>();
		currentPage = null;
	}
	
	public void visitPage(String url) {
		if(currentPage!=null) {
			backStack.push(currentPage);
		}
		currentPage = url;
		forwardStack.clear();
		System.out.println("Visited: "+currentPage);
	}
	
	public void goBack() {
		if(!backStack.isEmpty()) {
			backStack.push(currentPage);
			currentPage = backStack.pop();
			System.out.println("Went back to: ."+currentPage);
		}
		else {
			System.out.println("No pages to go back to");
		}
	}
	
	public void goForward() {
		if(!forwardStack.isEmpty()) {
			backStack.push(currentPage);
			currentPage=forwardStack.pop();
			System.out.println("Went forward to: "+currentPage);
		}
		else {
			System.out.println("No pages to go forward to");
		}
	}
	
	public void displayCurrentPage() {
		if(currentPage!=null) {
			System.out.println("Current page: "+currentPage);
		}
		else {
			System.out.println("No pages in history");
		}
	}

}
