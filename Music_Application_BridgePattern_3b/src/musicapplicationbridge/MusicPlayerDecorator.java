package musicapplicationbridge;

abstract class MusicPlayerDecorator extends MusicPlayer{
	protected MusicPlayer decoratedPlayer;

	public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
		super(decoratedPlayer.musicSource);
		this.decoratedPlayer = decoratedPlayer;
		// TODO Auto-generated constructor stub
	}

	@Override
	abstract void play();

}
