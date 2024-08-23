package music_application_decorator;

public class OnlineStreamingAdapter implements MusicSource{
	private String streamUrl;
	
	public OnlineStreamingAdapter(String streamUrl) {
		this.streamUrl = streamUrl;
	}

	@Override
	public void play() {
		System.out.println("Playing music from online stream: "+streamUrl);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		System.out.println("Playing music from online stream: "+streamUrl);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("Stopping music from online stream: "+streamUrl);
		// TODO Auto-generated method stub
		
	}

}
