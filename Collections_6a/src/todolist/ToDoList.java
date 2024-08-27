package todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<Task> tasks;
	
	public ToDoList() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String description) {
		tasks.add(new Task(description));
		System.out.println("Task added: "+description);
	}

	public void updateTask(int index,String newDescription) {
		if(index>=0 && index<tasks.size()) {
			Task task = tasks.get(index);
			task.setDescription(newDescription);
			System.out.println("Task Updated at index: "+index+": "+newDescription);
		}
		else {
			System.out.println("Invalid index. Task not found");
		}
	}
	
	public void removeTask(int index) {
		if(index>=0 && index<tasks.size()) {
			Task removedTask = tasks.remove(index);
			System.out.println("Task removed at index "+index+": "+removedTask.getDescription());
		}
		else {
			System.out.println("Invalid index. Task not Found");
		}
	}
	
	public void displayTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No two tasks in the list");
		}
		else {
			System.out.println("To do List: ");
			for(int i=0;i<tasks.size();i++) {
				System.out.println((i+1)+". "+tasks.get(i));
			}
		}
	}
}
