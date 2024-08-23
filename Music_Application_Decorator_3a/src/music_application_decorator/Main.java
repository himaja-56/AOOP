package music_application_decorator;

public class Main {

	public static void main(String[] args) {
		MusicPlayer basicPlayer = new BasicMusicPlayer();
		MusicSource localFile = new LocalFileAdapter("songs.mp4");
		MusicPlayer playerWithEqualizer = new EqualizerDecorator(basicPlayer);
		MusicPlayer playerWithVolumeControl = new VolumeControlDecorator(playerWithEqualizer);
		playerWithVolumeControl.playMusic(localFile);
		// TODO Auto-generated method stub

	}

}
