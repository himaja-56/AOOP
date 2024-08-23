package ride;

public class CreditCardPaymentFactory extends PaymentMethodFactory{

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
		return new CreditCardPayment();
	}

}
