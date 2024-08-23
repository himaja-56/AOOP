package musicapplicationbridge;

public abstract class MusicPlayer {
	protected MusicSource musicSource;
	
	public MusicPlayer(MusicSource musicSource) {
		this.musicSource = musicSource;
	}
	abstract void play();

}
