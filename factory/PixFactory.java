package factory;

public class PixFactory extends AbstractFactory{
    @Override
    public IPaymentCondition createPaymentCondition() {
        return new Pix();
    }
}
