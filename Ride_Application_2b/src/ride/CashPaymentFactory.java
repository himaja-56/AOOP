package ride;

public class CashPaymentFactory extends PaymentMethodFactory{

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
		return new CashPayment();
	}

}
