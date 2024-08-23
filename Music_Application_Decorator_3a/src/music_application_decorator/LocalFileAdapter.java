package music_application_decorator;

public class LocalFileAdapter implements MusicSource{
	private String filePath;
	
	public LocalFileAdapter(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void play() {
		System.out.println("Playing music from local file: "+filePath);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		System.out.println("Pausing Music from local file: "+filePath);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("Stopping music from local file: "+filePath);
		// TODO Auto-generated method stub
		
	}

}
