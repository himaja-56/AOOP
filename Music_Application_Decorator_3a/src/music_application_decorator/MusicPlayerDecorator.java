package music_application_decorator;

public abstract class MusicPlayerDecorator implements MusicPlayer{
	protected MusicPlayer decoratedPlayer;
	
	public MusicPlayerDecorator(MusicPlayer player) {
		this.decoratedPlayer = player;
	}
	
	@Override
	public void playMusic(MusicSource musicSource) {
		decoratedPlayer.playMusic(musicSource);
	}

}
