package factory;

public class BoletoFactory extends AbstractFactory {

    public BoletoFactory(){};

    @Override
    public IPaymentCondition createPaymentCondition() {
        return new Boleto();
    }
}
