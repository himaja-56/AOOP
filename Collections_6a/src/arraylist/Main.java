package arraylist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\nTask Manager");
			System.out.println("1.Add Task");
			System.out.println("2.Update Task");
			System.out.println("3.Remove Task");
			System.out.println("4.Display Task");
			System.out.println("5.Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {
				case 1:
					manager.addTask();
					break;
				case 2:
					manager.updateTask();
					break;
				case 3:
					manager.removeTask();
					break;
				case 4:
					manager.displayTasks();
					break;
				case 5:
					System.out.println("Exiting....");
					return;
				default:
					System.out.println("Invalid choice.Please try again");
			}
			sc.close();
		}
		// TODO Auto-generated method stub

	}

}
