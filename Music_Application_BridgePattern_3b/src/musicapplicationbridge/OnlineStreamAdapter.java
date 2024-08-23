package musicapplicationbridge;

public class OnlineStreamAdapter implements MusicSource{
	
	private String streamingService;
	
	OnlineStreamAdapter(String streamingService) {
		this.streamingService = streamingService;
	}

	@Override
	public void play() {
		System.out.println("Streaming from: "+streamingService);
		// TODO Auto-generated method stub
		
	}

}
