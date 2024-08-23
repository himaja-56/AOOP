package music_application_decorator;

public class EqualizerDecorator extends MusicPlayerDecorator{

	public EqualizerDecorator(MusicPlayer player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playMusic(MusicSource musicsource) {
		super.playMusic(musicsource);
		applyEqualizer();
		// TODO Auto-generated method stub
		
	}

	private void applyEqualizer() {
		System.out.println("Applying equalizer settings...");
		// TODO Auto-generated method stub
		
	}

}
