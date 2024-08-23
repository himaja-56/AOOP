package musicapplicationbridge;

public class AdvancedMusicPlayer extends MusicPlayer{

	public AdvancedMusicPlayer(MusicSource musicSource) {
		super(musicSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	void play() {
		System.out.println("Playing with advanced featurs..");
		musicSource.play();
		// TODO Auto-generated method stub
		
	}
	
	void playWithEffects() {
		System.out.println("Applying sound effects..");
		musicSource.play();
	}

}
