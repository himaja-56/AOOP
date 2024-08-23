package ride;

public class DigitalWalletPaymentFactory extends PaymentMethodFactory {

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
		return new DigitalWalletPayment();
	}

}
