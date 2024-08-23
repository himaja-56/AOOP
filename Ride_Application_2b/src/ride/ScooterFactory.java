package ride;

public class ScooterFactory extends VehicleFactory{

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Scooter();
	}

}
