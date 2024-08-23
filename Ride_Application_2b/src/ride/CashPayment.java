package ride;

public class CashPayment implements PaymentMethod{

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing cash payment of $"+amount);
		// TODO Auto-generated method stub
		
	}

}
