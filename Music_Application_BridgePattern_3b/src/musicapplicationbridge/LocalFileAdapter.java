package musicapplicationbridge;

public class LocalFileAdapter implements MusicSource{
	private String localFile;
	
	public LocalFileAdapter(String localFile) {
		this.localFile = localFile;
	}

	@Override
	public void play() {
		System.out.println("Playing local file: "+localFile);
		// TODO Auto-generated method stub
		
	}

}
