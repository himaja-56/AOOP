package musicapplicationbridge;

public class VolumeControlDecorator extends MusicPlayerDecorator{

	public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
		super(decoratedPlayer);
		// TODO Auto-generated constructor stub
	}

	@Override
	void play() {
		System.out.println("Adjusting Volume...");
		decoratedPlayer.play();
		// TODO Auto-generated method stub
		
	}

}
