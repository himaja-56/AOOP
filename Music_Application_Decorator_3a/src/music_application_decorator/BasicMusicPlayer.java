package music_application_decorator;

public class BasicMusicPlayer implements MusicPlayer{

	@Override
	public void playMusic(MusicSource musicSource) {
		musicSource.play();
		// TODO Auto-generated method stub
		
	}

}
