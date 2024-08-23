package musicapplicationbridge;

public class MusicStreamingApp {

	public static void main(String[] args) {
		MusicSource localFile = new LocalFileAdapter("song.mp3");
        MusicSource streamingService = new OnlineStreamAdapter("Spotify");
        //MusicSource radioStation = new RadioStationAdapter("Radio FM");

        // Basic music player
        MusicPlayer basicPlayer = new MusicPlayer(localFile) {
            @Override
            void play() {
                musicSource.play();
            }
        };
        basicPlayer.play();

        // Advanced music player with effects
        AdvancedMusicPlayer advancedPlayer = new AdvancedMusicPlayer(streamingService);
        advancedPlayer.playWithEffects();

        // Music player with equalizer and volume control
        MusicPlayer decoratedPlayer = new VolumeControlDecorator(new EqualizerDecorator(basicPlayer));
        decoratedPlayer.play();
    }

}
