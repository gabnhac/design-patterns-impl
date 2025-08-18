package factory;

public abstract class AbstractFactory {

    public static IPaymentCondition factoryMethod(AbstractFactory factory){
        return factory.createPaymentCondition();
    }

    public abstract IPaymentCondition createPaymentCondition();

}
