package ride;

public class CreditCardPayment implements PaymentMethod{

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment of $" + amount);
		// TODO Auto-generated method stub
		
	}

}
