package musicapplicationbridge;

public class RadioStationAdapter implements MusicSource {
	private String radioStation;
	
	RadioStationAdapter(String radioStation) {
		this.radioStation = radioStation;
	}

	@Override
	public void play() {
		System.out.println("Tuning into Radio Station: "+radioStation);
		// TODO Auto-generated method stub
		
	}

}
