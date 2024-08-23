package musicapplicationbridge;

public class EqualizerDecorator extends MusicPlayerDecorator {

	public EqualizerDecorator(MusicPlayer decoratedPlayer) {
		super(decoratedPlayer);
		// TODO Auto-generated constructor stub
	}

	@Override
	void play() {
		System.out.println("Applying equalizer settings..");
		decoratedPlayer.play();
		// TODO Auto-generated method stub
		
	}

}
