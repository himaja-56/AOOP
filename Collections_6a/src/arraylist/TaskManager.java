package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
	private ArrayList<Task> tasks;
	private Scanner scanner;
	
	public TaskManager() {
		tasks = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void addTask() {
		System.out.print("Enter Task Description: ");
		String description = scanner.nextLine();
		tasks.add(new Task(description));
		System.out.println("Task added");
	}
	
	public void updateTask() {
		displayTasks();
		System.out.print("Enter task number to update: ");
		int index = scanner.nextInt()-1;
		scanner.nextLine();
		if(index>=0 && index < tasks.size()) {
			System.out.print("Enter new Description: ");
			String description = scanner.nextLine();
			tasks.get(index).setDescription(description);
			System.out.println("Task updated");
		}
		else {
			System.out.println("Invalid task number");
		}
	}
	
	public void removeTask() {
		displayTasks();
		System.out.print("Enter task number to remove: ");
		int index = scanner.nextInt()-1;
		scanner.nextLine();
		if(index>=0 && index<tasks.size()) {
			tasks.remove(index);
			System.out.println("Task removed");
		}
		else {
			System.out.println("Invalid task number");
		}
	}
	
	public void displayTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No tasks available");
		}
		else {
			for(int i=0;i<tasks.size();i++) {
				System.out.println((i+1)+". "+tasks.get(i));
			}
		}
	}

}
