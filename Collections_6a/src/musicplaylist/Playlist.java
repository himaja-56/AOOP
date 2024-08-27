package musicplaylist;

import java.util.List;
import java.util.LinkedList;

public class Playlist {
	private List<Song> songs;
	
	public Playlist() {
		songs = new LinkedList<>();
	}
	
	public void addSong(String songName) {
		songs.add(new Song(songName));
		System.out.println("Added song: "+songName);
	}
	
	public void removeSong(String songName) {
		boolean removed = false;
		for(Song song:songs) {
			if(song.getName().equalsIgnoreCase(songName)) {
				songs.remove(song);
				System.out.println("Removed song: "+songName);
				removed = true;
				break;
			}
		}
		if(!removed) {
			System.out.println("Song not found: "+songName);
		}
	}

	public void moveSong(String songName, int newPosition) {
		if(newPosition<1 || newPosition>songs.size()) {
			System.out.println("Invalid position.Please choose a position between 1 and "+songs.size());
			return;
		}
		for(int i =0;i<songs.size();i++) {
			if(songs.get(i).getName().equalsIgnoreCase(songName)) {
				Song song = songs.remove(i);
				songs.add(newPosition-1,song);
				System.out.println("Moved song: "+songName+" to positon "+newPosition);
				return;
			}
		}
		System.out.println("Song not found: "+songName);
	}
	
	public void displayPlayList() {
		if(songs.isEmpty()) {
			System.out.println("The playlist is empty");
		}
		else {
			System.out.println("PlayList:");
			for(int i=0;i<songs.size();i++)
			System.out.println((i+1)+". "+songs.get(i));
		}
	}
	
}
