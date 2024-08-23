package ride;

public class Main {

	public static void main(String[] args) {
		UserAuthentication auth = UserAuthentication.getInstance();
		auth.login("Abc","123");
		
		if(auth.isAuthenticated()) {
			VehicleFactory vehicleFactory = new CarFactory();
			Vehicle vehicle = vehicleFactory.createVehicle();
			vehicle.drive();
			
			PaymentMethodFactory paymentFactory = new CreditCardPaymentFactory();
			PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
			paymentMethod.processPayment(200.00);
			
			auth.logout();
		}
		// TODO Auto-generated method stub

	}

}
