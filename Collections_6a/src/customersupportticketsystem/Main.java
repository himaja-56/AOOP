package customersupportticketsystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SupportTicketSystem supportSystem = new SupportTicketSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCustomer Support Ticket System Menu:");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display All Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String description = sc.nextLine();
                    supportSystem.addTicket(description);
                    break;
                case 2:
                    supportSystem.processNextTicket();
                    break;
                case 3:
                    supportSystem.displayPendingTickets();
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
		// TODO Auto-generated method stub

	}

}
