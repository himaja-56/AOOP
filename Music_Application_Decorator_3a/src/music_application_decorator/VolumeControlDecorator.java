package music_application_decorator;

public class VolumeControlDecorator extends MusicPlayerDecorator{

	public VolumeControlDecorator(MusicPlayer player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playMusic(MusicSource musicsource) {
		super.playMusic(musicsource);
		adjustVolume();
		// TODO Auto-generated method stub
		
	}

	private void adjustVolume() {
		System.out.println("Adjusting Volume Settings...");
		// TODO Auto-generated method stub
		
	}

}
