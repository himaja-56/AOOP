package browsinghistory;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		BrowserHistory browserHistory = new BrowserHistory();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBrowser History Menu:");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL of the page to visit: ");
                    String url = sc.nextLine();
                    browserHistory.visitPage(url);
                    break;
                case 2:
                    browserHistory.goBack();
                    break;
                case 3:
                    browserHistory.goForward();
                    break;
                case 4:
                    browserHistory.displayCurrentPage();
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
