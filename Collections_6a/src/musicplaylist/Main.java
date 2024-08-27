package musicplaylist;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Playlist Menu:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the song to add: ");
                    String songName = scanner.nextLine();
                    playlist.addSong(songName);
                    break;
                case 2:
                    System.out.print("Enter the name of the song to remove: ");
                    String removeSongName = scanner.nextLine();
                    playlist.removeSong(removeSongName);
                    break;
                case 3:
                    System.out.print("Enter the name of the song to move: ");
                    String moveSongName = scanner.nextLine();
                    System.out.print("Enter the new position: ");
                    int newPosition = scanner.nextInt();
                    playlist.moveSong(moveSongName, newPosition);
                    break;
                case 4:
                    playlist.displayPlayList();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
		// TODO Auto-generated method stub

	}

}
