package music_application_decorator;

public class RadioStationAdapter implements MusicSource{
	private String stationUrl;
	
	public RadioStationAdapter(String stationUrl) {
		this.stationUrl = stationUrl;
	}

	@Override
	public void play() {
		System.out.println("Playing Radio Station: "+stationUrl);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		System.out.println("Pausing Radio Station: "+stationUrl);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("Stoping Radio Station: "+stationUrl);
		// TODO Auto-generated method stub
		
	}

}
