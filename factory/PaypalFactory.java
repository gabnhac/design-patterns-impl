package factory;

public class PaypalFactory extends AbstractFactory {
    @Override
    public IPaymentCondition createPaymentCondition() {
        return new Paypal();
    }
}
