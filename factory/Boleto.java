package factory;

public class Boleto implements IPaymentCondition{
    @Override
    public int pay() {
        System.out.println("Processando pagamento Boleto...");
        return 1;
    }
}
