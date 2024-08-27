package todolist;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = sc.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = sc.nextInt() - 1;
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter new task description: ");
                    String newDescription = sc.nextLine();
                    toDoList.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = sc.nextInt() - 1;
                    toDoList.removeTask(removeIndex);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
		// TODO Auto-generated method stub

	}

}
